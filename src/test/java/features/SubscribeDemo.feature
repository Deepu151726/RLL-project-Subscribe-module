Feature: Subscribe to Email

  Scenario: User subscribe to email
    Given user is on landing page
    Given the user is on the subscription page
    When the user enters thier "email"
    And clicks on the subscribe button
    Then they should see a confirmation message
