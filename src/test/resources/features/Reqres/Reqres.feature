Feature: Serenity Rest QE 14
@Latihan
  Scenario Outline: Get list user with valid parameter page
    Given Get list user with parameter page <page>
    When Send request get list users
    Then Status code should be <statusCode>
    Examples:
      | page | statusCode |
      | 2    | 200        |
      | 1    | 200        |
      | 3    | 200        |
@Latihan
Scenario: Post create user with valid json
  Given Create user with valid json "CreateUser.json"
  When  Send request create new user
  Then  Status code should be 201
@Latihan
  Scenario Outline: Update user with valid json and user id
    Given Update user with valid json <json> and user id <id>
    When Send request update user
    Then Status code should be <statusCode>
    Examples:
      | json               | id | statusCode |
      | "UpdateUser.json"  | 2  | 200        |
      | "UpdateUser2.json" | 3  | 200        |
      | "UpdateUser3.json" | 4  | 200        |
@Latihan
    Scenario: Delete user with valid user id
      Given Delete user with user id 2
      When  Send request delete user
      Then  Status code should be 204