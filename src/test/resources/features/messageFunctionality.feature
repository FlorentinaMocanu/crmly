
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
    Given User logs in
  Then user click on message button



 @CRMLY10-229
  Scenario: User send a message by filling in the mandatory fields.
    When user type "Hello" in message fields
    Then User click send message button

   @CRMLY10-231
   Scenario:The message delivery should be to 'All employees' by default and should be changeable.
     When user see All employees by default
     And user can delete All employees from recipients

     @CRMLY10-232 @wip
   Scenario:user see error message if want to send message without recipient
     When user type "Hello" in message fields
     And user can delete All employees from recipients
     And User click send message button
     Then user see error message "Please specify at least one person."


     @CRMLY10-233
      Scenario: user see error message if want to send message without title
       When user click sent message button without title
       Then user sees error message "The message title is not specified"

     @CRMLY10-234
     Scenario: More than one recipient can be added and are deletable.
       When user see All employees by default
       And user add new recipient "helpdesk2@cybertekschool.com"
       And user add second recipient "helpdesk4@cybertekschool.com"
      Then user delete added recipients


    @CRMLY10-235
    Scenario: User should be able to cancel sending messages at any time before sending.
    When   user type "Hello" in message fields
    Then user cancel send message