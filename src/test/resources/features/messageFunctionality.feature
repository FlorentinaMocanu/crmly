
 #CRMLY10-211
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
    When user click login button go to home page
    Then click on message button

 @CRMLY10-229 @wip
  Scenario: User send a message by filling in the mandatory fields.
    When user enters text in message fields
    Then User sent message

   @CRMLY10-231 @wip
   Scenario:The message delivery should be to 'All employees' by default and should be changeable.
     Given user see All employees is default
     And user can delete All employees from recipients

     @CRMLY10-232 @wip
   Scenario:user see error message if want to send message without recipient
     Given user enters text in message fields
     And user can delete All employees from recipients
      When User sent message
     Then user see error message for recipient field


     @CRMLY10-233 @wip
      Scenario: user see error message if want to send message without title
        Given User sent message
        Then user see error message for message title

     @CRMLY10-234 @wip
     Scenario: More than one recipient can be added and are deletable.
       Given user see All employees is default
       And  user add a recipient
       And user add second recipient
       When user delete second recipient
       Then user delete added recipient


    @CRMLY10-235 @wip
    Scenario: User should be able to cancel sending messages at any time before sending.
    Given user enters text in message fields
    Then user cancel send message