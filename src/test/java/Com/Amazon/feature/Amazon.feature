Feature: Amazon Order Booking Functionality

Scenario: Amazon HomePage Searching Functionality
Given User Launched the Broswer
When User Enters on Url
When User  Enters on Details in Search Box
When User Click Search Button
Then Verified the Searching Functionality to Navigate The SelectProductPage

Scenario: Amazon Select Product Functionality
Given User Select The Product on Web Page 
When Click on the Specified Product
Then Verified the Select Product Functionality To Navigate The My Product Page

Scenario: Amazon My Product Functionality
Given User click the Cart Button
Then Verified the My product Functionality To Navigate to the LogOut Page

Scenario: Amazon SignOut Functionality 
Given User Moves to mouse on Account and List 
When User click Sign Out Button
Then Verified the Sign Out Functionality


