Feature: handling chat bot
  @chatbot
  Scenario: verify that chatbot is disappear
    Given Loginto url with below credentials
    And check the chatbot is appear
    Then dismiss the chatbot


  Scenario: verify that chatbot is disappear or not
    Given Loginto the url with below credentials
    And check the chatbot is appear or not
    Then move to chatbot and dismiss it