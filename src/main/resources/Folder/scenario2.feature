Feature: DemoTours
Scenario Outline: Flight Login
Given user opens Demotours in chrome browser
When enter the username as "<username>" and password as "<password>" 
And click the signin button
Then verify the login is success

Examples: 
|username|password|
|mercury|mercury|
|Sample|Password123|
