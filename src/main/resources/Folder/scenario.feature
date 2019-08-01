Feature: Login functionality
Description: Registered user login to the application by entering username and password
Mapping: John would like access the online shopping page. He should be registered and should use 
registered credentials to get logged in to the application.
Scenario: Login with valid combination
Given user opens newtours application on chrome browser
When enter username as mercury and password field
And Click on signin button
Then verify login result as success

Scenario: Login with invalid combination
Given user opens newtours application on chrome browser
When enter username as "mercur" and password field
And Click on signin button
Then verify login result as success