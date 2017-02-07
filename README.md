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
http://wiprodigital.com/who-we-are#wdteam_meetus
http://wiprodigital.com/what-we-do#work-three-circles-row
http://wiprodigital.com/who-we-are#wdteam_leaders
http://wiprodigital.com/what-we-do#wdwork_cases
http://wiprodigital.com/what-we-do/#masthead
http://wiprodigital.com/what-we-do/#work-three-circles-row
http://wiprodigital.com/what-we-do/#wdwork_cases
http://wiprodigital.com/what-we-do/#wdwork_partners
http://wiprodigital.com/what-we-think
http://wiprodigital.com/what-we-do#wdwork_partners
http://wiprodigital.com/?s=&post_type[]=post
http://wiprodigital.com/?s=&post_type[]=cases
http://wiprodigital.com/?s=&post_type[]=events
http://wiprodigital.com/?s=&post_type[]=news
http://wiprodigital.com/join-our-team
http://wiprodigital.com/join-our-team/#masthead
http://wiprodigital.com/join-our-team/#wdcareers_team
http://wiprodigital.com/join-our-team/#wdcareers_jobs
http://wiprodigital.com/get-in-touch
http://wiprodigital.com/join-our-team#wdcareers_team
http://wiprodigital.com/get-in-touch#wddi-locations
http://wiprodigital.com/join-our-team#wdcareers_jobs
http://wiprodigital.com/get-in-touch#wddi-contact
http://wiprodigital.com/get-in-touch/#masthead
http://wiprodigital.com/get-in-touch/#wddi-locations
http://wiprodigital.com/get-in-touch/#wddi-contact
http://wiprodigital.com/privacy-policy
http://wiprodigital.com/designit-approach
http://wiprodigital.com/
http://wiprodigital.com/#AllcontntAggr
http://wiprodigital.com/#InscontntAggr
http://wiprodigital.com/#CascontntAggr
http://wiprodigital.com/#EvtcontntAggr
http://wiprodigital.com/#NewcontntAggr
http://wiprodigital.com/cases/increasing-customer-value-through-iot-for-jcb-india/
http://wiprodigital.com/2016/12/19/podcasts-2035-give-us-glimpse-future-transit/
http://wiprodigital.com/tag/design/
http://wiprodigital.com/tag/designit/
http://wiprodigital.com/tag/hyperloop/
http://wiprodigital.com/tag/podcast/
http://wiprodigital.com/tag/the-future-of-transit/
http://wiprodigital.com/tag/transportation/

TODO:
-----
1. write UNIT test
2. Add comments for each functions
3. Sort the O/P in structured site map
4. Refactor for code improvement