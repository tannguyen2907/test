Feature: Application Login Test
  Background:
    Given validate the browser
    When Browser is triggered
    Then Check if browser is displayed

  Scenario: Home Page default login
    Given User is on the even landing page
    When User logins into application with username "abc" and password "abc"
    Then Home page is populated
    And Cards displayed are "true"

  Scenario: Home Page default login
    Given User is on the even landing page
    When User logins into application with username "abc" and password "abc"
    Then Home page is populated
    And Cards displayed are "False"


  Scenario: Home Page default login 1
    Given User is on the even landing page
    When User sign up with information
      | username | password | email | country | phone |
      | abc | bcd | abc@gmail.com | Vietnam | 0123453 |
      | abc2 | bcd2 | abc2@gmail.com | Vietnam | 01234153 |
    Then Home page is populated
    And Cards displayed are "ABC"

  @BeforeTesting  @AfterTesting
  Scenario: Signup at HomePage
    Given User is on the even landing page
    When User sign up with following details
      | Jack | 123123 | abc@gmail.com | Vietnam | 0123453 |
    Then Home page is populated
    And Cards displayed are "False"

  @BeforeTesting  @AfterTesting
  Scenario Outline: Signup at HomePage With US PS
    Given User is on the even landing page
    When User sign up with "<username>" and "<password>"
    Then User should see the homepage
    And Value is "false"
    Examples:
      | username       | password |
      | Friday         | TGIF   |
      | Sunday         | Nope   |
      | anything else! | Nope   |


