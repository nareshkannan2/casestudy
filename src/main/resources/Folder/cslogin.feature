Feature: TestMeApp login
Scenario Outline: Login the TestMeApp
 Given user opens the testmeapp on chrome browser
 Then user enters the username "<username>" and password "<password>" 
 Then click on SignIn Button 
 Then verify the login as Successful
 Examples:
 |username|password|
 |rosario|rosario|
