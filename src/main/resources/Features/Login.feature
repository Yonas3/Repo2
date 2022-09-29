Feature: Feature to test login functionlity

  Scenario: postive test validating login page
    Given Intialize the browser with chrome
    And Navigate to "https://rahulshettyacademy.com" site
    And Click on Login link in home page to land on Sign in page
    When User enters "yonasshumet@gmail.com" and "Udemyplace.32" and logs in
    Then Verify that user is successfully logged in
