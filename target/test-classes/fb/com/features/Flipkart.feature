Feature: Flipkart Add to Cart Function testcase Automation


@Flipkart
Scenario: Flipkart add to cart a mobile product
Given User Launch Chrome Browser 
And Verify land and Login page
And Handle the login popup
And User clicks the Mobile product
And User chooses MI phone under Electronics category
And User fixes the maximum price of mobile using dropdown
And User clicks a product to buy
And Handling the Window to stop  desired product window "Mi Redmi 9A Sport ( 32 GB Storage, 3 GB RAM ) Online at Best Price On Flipkart.com"
And User entering their Pincode "600040" to know Availability and delivery of Product
And User add the item to purchase by clicking add to cart Button
And User closing the Browser




