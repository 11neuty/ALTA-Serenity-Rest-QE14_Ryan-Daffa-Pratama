Feature: Positive and negative test case 'put' method
  As user i can check method 'put' to update data
  @Tugas
  Scenario: Update user with valid json and user id
    Given Update user with valid json <json> and user id <id>
    When  Send request update user
    Then  Status code should be <statusCode>


  @Tugas
  Scenario: Update user with invalid json and user id
    Given Update user with invalid json <json> and user id <id>
    When  Send request update user
    Then  Status code should be <statusCode>