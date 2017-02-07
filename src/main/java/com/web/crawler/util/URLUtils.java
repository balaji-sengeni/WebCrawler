package com.web.crawler.util;

/**
 * Created by BalajiS on 07/02/2017.
 */
public class URLUtils {

    public static boolean isUrlValidToCrawl(String nextUrl, String domainUrl) {

        //should visit all pages within the domain  [http://wiprodigital.com]
        if(!nextUrl.startsWith(domainUrl)){
            return false;
        }
        if(nextUrl.startsWith("javascript:"))  { return false; }
        if(nextUrl.contains("mailto:"))        { return false; }
        if(nextUrl.startsWith("#"))            { return false; }
        if(nextUrl.endsWith(".swf"))           { return false; }
        if(nextUrl.endsWith(".pdf"))           { return false; }
        if(nextUrl.endsWith(".png"))           { return false; }
        if(nextUrl.endsWith(".gif"))           { return false; }
        if(nextUrl.endsWith(".jpg"))           { return false; }
        if(nextUrl.endsWith(".jpeg"))          { return false; }
        return true;
    }

}
