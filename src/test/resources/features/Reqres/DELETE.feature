Feature: Positive and negative test case 'delete' method
  As user i can check method 'delete' to delete data

  Scenario: Delete user with valid user id
    Given Delete user with user id 10
    When  Send request delete user
    Then  Status code should be 204

    Scenario: Delete user with invalid user id
      Given Delete user with user id 16
      When  Send request delete user
      Then  Status code should be 204

