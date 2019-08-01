Feature: Display cart icon without adding to cart 
Scenario: The one where the user moves to cart without adding any item in it 
Given lalitha has registered in to TestMeApp 
When lalitha search a particular product like headphones 
And try to proceed to payment without adding any item in the cart
Then TestMeApp doesn't display the cart icon 