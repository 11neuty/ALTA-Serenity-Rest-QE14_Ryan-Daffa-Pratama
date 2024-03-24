Feature: Positive and negative test case 'put' method
  As user i can check method 'put' to update data
  @Tugas
  Scenario: Update user with valid json and user id
    Given Update user with valid json "Update.json" and user id 1
    When  Send request update user
    Then  Status code should be 200
    And


  @Tugas
  Scenario: Update user with invalid json and user id
    Given Update user with invalid json "invalidUpdate.json" and user id 1
    When  Send request update user
    Then  Status code should be 200
