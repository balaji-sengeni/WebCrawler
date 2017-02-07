package com.web.crawler;

import java.io.IOException;
import java.util.*;

import com.web.crawler.util.URLUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by BalajiS on 07/02/2017.
 */
public class BaseCrawler {

    protected Set<String> crawledUrls = new HashSet<String>();
    protected String domainUrl = null;

    public BaseCrawler() {
    }

    public BaseCrawler(String domainUrl) {
        this.domainUrl = domainUrl;
    }

    public void crawl() {

        long startTime = System.currentTimeMillis();

        this.retrievePageLinks(domainUrl);

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("URL's crawled: " + this.crawledUrls.size() + " in " + totalTime + " ms (avg: " + totalTime / this.crawledUrls.size() + ")");
    }

    protected void retrievePageLinks(String URL) {

        //1. check is it valid URL to crawl
        if (!URLUtils.isUrlValidToCrawl(URL, domainUrl)) return; // skip this URL.

        //2. Check if you have already crawled the URLs
        if (!crawledUrls.contains(URL)) {
            try {
                //2. (a) If not add it to the index
                if (crawledUrls.add(URL)) {
                    System.out.println(URL);
                }
                //3. Fetch the HTML code
                Document document = Jsoup.connect(URL).get();
                //4. Parse the HTML to extract links to other URLs
                Elements linksOnCurrentPage = document.select("a[href]");

                //5. For each extracted URL... go back to Step 1.
                for (Element page : linksOnCurrentPage) {
                    retrievePageLinks(page.attr("abs:href"));
                }
            } catch (IOException e) {
                System.err.println("For '" + URL + "': " + e.getMessage());
            }
        }
    }

    public Set<String> getCrawledUrls() {
        return crawledUrls;
    }

    public void setCrawledUrls(Set<String> crawledUrls) {
        this.crawledUrls = crawledUrls;
    }

    public String getDomainUrl() {
        return domainUrl;
    }

    public void setDomainUrl(String domainUrl) {
        this.domainUrl = domainUrl;
    }

}
