Feature: DemoTours
Scenario: Flight Login
Given user opens the demotour flight in chrome browser
When user enters the username as "<un>" and password as "<pwd>" 
And click the Signin button
Then verify the login

Scenario: select flight
When user enters the fromflight as "Meghalaya" and toflight as
