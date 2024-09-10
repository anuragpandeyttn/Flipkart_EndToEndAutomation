Feature: To validate the Flipkart Application

Background:

Given launch the Flipkart Application 
Then It should be Navigate to the home page


@tc001
Scenario: To validate the search functionality 
Given User enter the text in the search page 
When Click the search button 
Then It should navigate to the search result page and display the relevent details 
And Select Minimum and Maximum Amount
And Select the Brand
And Select the Ram
And Select the Battery Capacity
Then It should display the Relevant Result


@tc002 
Scenario: To validate the Fashion Functionality

Given User to move the Fashion link
When Curser to move to the Kids link
And  Move to girls dress and click 
And Click the price High to low link
Then It should display the relevent details and get the title

@tc003
Scenario: To validate the Home&Furniture Functionality
Given User to move the Home&Furniture
When Curser to move the Home Decor link
And Move to Lighting and click
And Click the price Hight to low
Then It should display the relevant details and get the title 


@tc004

Scenario Outline: To validate the search functionalty with different values 

Given Enter the "<searchtext>" in the search field
When click the search button
Then It should navigate to the next page and display the corresponding page

Examples: 
|searchtext|
|Mobile|
|Tv|
|Speaker|
|Shirts|
|The Bear House Shirts|
|12312|
|Home Decor items|



@tc005

Scenario: To validate upto addcart functionality
Given User can move to the login link
When User can click on Flipkart Plus zone
And Mouse move to the Home&Furniture link
And Going to click the wall lamp
And Scroll down the page and click one perticular result
And Enter the delivery pin code and click the check link
Then Pincode should be checked and displayed and verify the titles





