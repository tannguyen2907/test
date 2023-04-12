Feature: Application Login Test

@SmokeTest
  Scenario: Home Page default login
    Given User is on the even landing page
    When User logins into application with username "abc" and password "abc"
    Then Home page is populated
    And Cards displayed are "true"

