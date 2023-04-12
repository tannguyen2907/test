Feature: Search and Place the order for the product
  @Tester @AfterTesting
  Scenario: Search for the product in home and offers page
    Given User is on the GreenCart landing page
    When User search with ShortName "Tomato" and extracted actual name of product
    Then User search for the same shortname "Tomato" in offers page to check if the product exist
    And Validate the search name is matches with Landing Page
