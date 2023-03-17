Feature: As a user, I should be able to send messages by clicking on Message tab under Active Stream
  Agile story: 1. User should be able to send a message by filling in the mandatory fields.
               2. The message delivery should be to 'All employees' by default and should be changeable.
               3. User should be able to cancel sending messages at any time before sending.
  Description
  Mandatory fields:  'Message content & 'Recipient'.
  Error messages for mandatory fields:
  "The message title is not specified."
  "Please specify at least one person."
  More than one recipient can be added and are deletable.

  Background:user is on login page
    Given user is login page
    And user enter valid username,password
    And user click login button
    When user is on home page
    Then click on message button


  Scenario: User send a message by filling in the mandatory fields.
    When user enters text in message fields
    And user add a recipient
    Then User sent message
