Feature: Successful withdrawal
   Scenario: User tries to withdraw an amount
      Given my wallet has been credited with $1000
      When I withdraw $700
      Then $700 should be dispensed
      And My account's balance should be $300
      And After withdrawal I should be able to make another operation