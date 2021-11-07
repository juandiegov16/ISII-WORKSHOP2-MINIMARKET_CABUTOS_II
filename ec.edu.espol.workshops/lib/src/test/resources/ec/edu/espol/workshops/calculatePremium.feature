Feature: Calculate premium

Scenario Outline: Customer has license or not
Given customer <has_license>
When validating data entry
Then <event> 

Examples:
| has_license | event |
| "Y" | calculate premium|
| "N" | deny insurance |

Scenario Outline: Customer is older than 80 or not
Given customer is <age> years old
When validating data entry
Then <event>


Examples:
| age | event |
| 79 | calculate premium|
| 81 | deny insurance |




