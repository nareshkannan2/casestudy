Feature: Product purchase
Scenario: Purchase of headphone
Given user opens the browser
Then user enters the username as "lalitha" and password as "Password123" 
Then user clicks the login button 
When user find the home page 
Then user clicks the search engine 
Then user add the product to cart 
Then user checks out the product 
Then user reviews the product
And proceed to payment 
Then user select the bank
Then user login to the payment gateway 
Then user enters the tranpassword as "Trans@456" 
And user clicks the pay now button 
Then user verifies the order details 
And SignOut button is clicked 