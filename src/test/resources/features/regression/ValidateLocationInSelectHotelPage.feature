Feature: Hotel Search Functionality

  @TC-104
  Scenario: Verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel
  
    Given User is logged into the Adactin application with valid credentials
    And User is on the "Search Hotel" page
    When User selects Location as "Sydney"
    And User selects Hotel as "Hotel Creek"
    And User selects Room Type as "Standard"
    And User selects Number of Rooms as "1"
    And User enters Check-In Date as "today"
    And User enters Check-Out Date as "tomorrow"
    And User selects Adults per Room as "1"
    And User clicks the Search button
    Then The application should navigate to the Select Hotel page
    And The displayed Location should match "Sydney"