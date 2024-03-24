Feature: Positive and Negative test case get list method
  As user i can check the method 'get' to search list user
  @Tugas
  Scenario: Get list user with valid parameter page
    Given Get data user with valid parameter page 1
    When Send request get list users
    Then Status code should be 200
    And  Response body data should be 1
    And  Validate json schema "GetListUser.json"


  @Tugas
  Scenario: Get list user with invalid parameter page
    Given Get data user with invalid parameter page 55
    When  Send request get list users
    Then  Status code should be 200
