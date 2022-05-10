Feature: Login Ebay

  Scenario: Login to Ebay with valid credentials

    Given I am on ebay Homepage
    When I click on register and land on register page
    Then I put email in email box and click continue
    And I enter password in password field and click submit
    Then I can see the appropriate user logged in

