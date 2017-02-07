web crawler - in Java Language
==============================
Project Overview
----------------
The crawler should be limited to one domain.
 Given a starting URL – say http://wiprodigital.com - it will visit all pages within the domain, but not follow the links to external sites such as Google or Twitter.

Installation:
------------
To build run the bellow command on the project's root directory

    	mvn clean install

    	java -cp simple-web-crawler-1.0.jar com.web.crawler.SimpleWebCrawler http://wiprodigital.com

Sample O/P:
----------

java -cp simple-web-crawler-1.0.jar com.web.crawler.SimpleWebCrawler http://wiprodigital.com


http://wiprodigital.com

http://wiprodigital.com/who-we-are

http://wiprodigital.com/who-we-are/#masthead

http://wiprodigital.com/who-we-are/#wdteam_meetus

http://wiprodigital.com/who-we-are/#wdteam_leaders

http://wiprodigital.com/what-we-do

...

TODO:
-----
1. write UNIT test
2. Add comments for each functions
3. Sort the O/P in structured site map
4. Refactor for code improvement