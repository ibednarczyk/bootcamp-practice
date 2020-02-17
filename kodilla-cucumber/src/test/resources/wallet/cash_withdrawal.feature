Feature: Cash Withdrawal

    Scenario Outline: Successful withdrawal from a wallet in credit
        Given I have deposited $200 in my wallet
        When I request $<amount>
        Then $<amount> should be dispensed
            Examples:
                | amount |
                | 30 |
                | 200|


    Scenario Outline: Unsuccessful withdrawal from a wallet
        Given I have deposited $<money> in my wallet
        When I request $<amount>
        Then Any money should be dispensed
            Examples:
                | money | amount |
                | 200 | 250 |
                | 200 | 0 |
                | 0 | 200 |

