Feature: To verify the Synergy Login function

  Scenario Outline: Validate login function using invalid creds

    Given verify user launched synergy url
    When user enter "<username>" and "<password>"
    And User click submit button
    Then verify user get error message successfully

    Examples:
      |username                       | password    |
      |navamanikandan                 |nava@123     |
      |navamanikandan@g2techsoft.com  |navam@123456 |

  Scenario: Validate login function using valid creds

    Given verify user launched synergy url
    When user enter "651" and "India@2021"
    And User click submit button
    Then verify user navigated next page successfully