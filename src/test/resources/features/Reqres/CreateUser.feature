Feature: Positive and Negative test case post method
  As user i can check method 'post' to create single user
  @Tugas
  Scenario: Post create single user with valid json
    Given Create user with valid json "ValidCreate.json"
    When  Send request create new user
    Then  Status code should be 201
    And   Response body id should be "morpheus"
    And   Validate json schema "ValidCreateSchema.json"


  @Tugas
  Scenario: Post create single user with invalid json
    Given Create user with invalid json "InvalidCreate.json"
    When  Send request create new user
    Then  Status code should be 400


