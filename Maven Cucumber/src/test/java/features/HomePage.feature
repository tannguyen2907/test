Feature: Application HomePage

  Background:
    Given valid the browser
    When Browser is triggered
    Then Check if browser is displayed

    @BeforeTesting
    Scenario: Home page default login
      Given User is on the landing page
      When User logins into application with username "abc" and password "abc"
      Then Home page is populated
      And Cards displayed are "true"