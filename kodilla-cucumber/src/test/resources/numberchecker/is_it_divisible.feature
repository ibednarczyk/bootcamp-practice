Feature: Is it divisible?

    Scenario Outline: Number is divisible by 3 or 5 or 3 and 5
        Given There is a <number>
        When Check whether number is divisible by three, five, or three and five
        Then I should receive <answer>
            Examples:
                | number | answer |
                | 3 | "Fizz" |
                | 5 | "Buzz" |
                | 8 | "None" |
                | 10 | "Buzz" |
                | 15 | "FizzBuzz"|
                | 21 | "Fizz" |
                | 30 | "FizzBuzz"|
                | 35 | "Buzz" |
                | 41 | "None" |
                | 45 | "FizzBuzz"|
                | 48 | "Fizz" |

