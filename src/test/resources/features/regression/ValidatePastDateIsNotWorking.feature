Feature: To validate past date is selected when booking the hotel
@TC-103
Scenario: validate past date is working

Given User is logged into the Adactin application with valid credentials 
And User is on the "Search Hotel" page 
When User selects Location as "Sydney" 
And User selects Hotel as "Hotel Creek" 
And User selects Room Type as "Standard" 
And User selects Number of Rooms as "1" 
And User enters Check-In Date as "5 days before today" 
And User enters Check-Out Date as "3 days before today" 
And User clicks the Search button 
Then The application should display an error message