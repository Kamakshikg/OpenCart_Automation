Feature: Feature to test Register Functionality

  Scenario: Validate Registering an Account by providing only the Mandatory fields.
    Given Click on My Account dropdown
    And Click on register option
    When User Enters new Account Details into the Mandatory Fields
    And Check agree privacy policy and click on Continue button