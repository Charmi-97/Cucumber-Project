
Feature: Automate the Sign up page of the website "https://thinking-tester-contact-list.herokuapp.com/addUser"
  

    Scenario: To check if Sign up is successful for a new user with valid credentials
    
    Given User is on Add User page
    When User enters First Name, Last Name, Email and Password
    And Clicks on Submit button
    Then The User is navigated to Contact List page and clicks on Logout button
    And Close the browser

