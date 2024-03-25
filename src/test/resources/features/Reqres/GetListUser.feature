Feature: Get list user
  As user i can check the method 'get' to search list user

  @Tugas
  Scenario Outline: Get list user with valid parameter page
    Given Get data user with valid parameter page <page>
    When  Send request get list users
    Then  Status code should be <statusCode>
    And   Response body data page should be <page>
    And   Validate json schema <json>
    Examples:
      | page | statusCode | json               |
      | 1    | 200        | "GetListUser.json" |
      | 2    | 200        | "GetListUser.json" |
      | 3    | 200        | "GetListUser.json" |


  @Tugas
  Scenario: Get list user with invalid parameter page
    Given Get data user with invalid parameter page 55
    When  Send request get list users
    Then  Status code should be 200
