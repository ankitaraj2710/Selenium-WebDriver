Feature: Application Login


Scenario: Home Page Default Login
Given User is on NetBanking landing page
When User login into applicaton with "Ankita" and "123"
Then Home page is populated
And Cards are displayed "true"


Scenario: Home Page Default Login
Given User is on NetBanking landing page
When User login into applicaton with "lucky" and "456"
Then Home page is populated
And Cards are displayed "false"