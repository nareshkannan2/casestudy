Feature: Registration in TestMeApp
Scenario: Register with new credentials
Given user opens the chrome browser 
And enters the url
Given enter the username as "rosario" 
When enter the first name as "antony" 
When enter the second name as "rosario" 
When enter the password as "rosario" 
When confirm the password as "rosario" 
When check the gender box   
When enter the email id as "rosario@gmail.com" 
When enter the mobile number as "9876543210" 
When enter the dob
When enter the address 
When enter the answer 
And user clicks register button 
Then verify registration 