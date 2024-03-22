Feature: Positive and Negative test case get list method
  As user i can check the method 'get' to search list user
  @Tugas
  Scenario: Get list user with valid parameter page
    Given Get data user with valid parameter page 1
    When Send request get list users
    Then Status code should be 200

  @Tugas
  Scenario: Get list user with invalid parameter page
    Given Get data user with invalid parameter page 15
    When  Send request get list users
    Then  Status code should be 404
