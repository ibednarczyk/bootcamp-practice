Feature: Checking correctness of the entered amount
Scenario: User tries to withdraw incorrect amount of money
      Given my wallet has been credited with $300
      When I am trying to withdraw $0
      Then nothing should be dispensed
      And I should be told that I have to enter the correct amount
