package com.web.crawler;

import org.apache.commons.validator.routines.*;
/**
 * Created by BalajiS on 07/02/2017.
 */
public class SimpleWebCrawler {
    public static void main(String[] args) {

        // timeout connection after 500 miliseconds
        System.setProperty("sun.net.client.defaultConnectTimeout", "500");
        System.setProperty("sun.net.client.defaultReadTimeout",    "1000");

        if(args.length < 1) {
            System.err.println("Provide an URL as argument to the SimpleWebCrawler class.");
            System.out.println("USAGE : java -cp simple-web-crawler-1.0.jar com.web.crawler.SimpleWebCrawler http://wiprodigital.com");
            return;
        }

        String inputURL = args[0];
        //Check the URL is valid
        UrlValidator defaultValidator = new UrlValidator();
        if (!defaultValidator.isValid(inputURL)) {
            System.err.println("Provide a valid URL as argument to the SimpleWebCrawler class.");
        }
        BaseCrawler baseCrawler = new BaseCrawler(inputURL);
        baseCrawler.crawl();
    }
}
