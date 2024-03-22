Feature: Positive and Negative test case post method
  As user i can check method 'post' to create & register single user
  @Tugas
  Scenario: Post create single user with valid json
    Given Create user with valid json "TugasPost.json"
    When  Send request create new user
    Then  Status code should be 201


  @Tugas
  Scenario: Post create single user with invalid json
    Given Create user with invalid json "asdn.json"
    When  Send request create new user
    Then  Status code should be 404


