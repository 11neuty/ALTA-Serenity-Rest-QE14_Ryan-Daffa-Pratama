Feature: Serenity Rest QE 14
@Latihan
  Scenario Outline: Get list user with valid parameter page
    Given Get list user with parameter page <page>
    When Send request get list users
    Then Status code should be <statusCode>
    And Response body page should be <page>
    And Validate json schema "ListUserJsonSchema.json"
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
  And   Response body name should be "Ryan Daffa" and job is "QA"
  And   Validate json schema "CreateUserJsonSchema.json"

@Latihan
  Scenario Outline: Update user with valid json and user id
    Given Update user with valid json <json> and user id <id>
    When Send request update user
    Then Status code should be <statusCode>
    And Response body name and job should be  <name> and <job>
    Examples:
      | json               |  | id | statusCode | name          | job         |  |
      | "UpdateUser.json"  |  | 2  | 200        | Ryan update 1 | QA update 1 |  |
      | "UpdateUser2.json" |  | 3  | 200        | Ryan update 2 | QA update 2 |  |
      | "UpdateUser3.json" |  | 4  | 200        | Ryan update 3 | QA update 3 |  |

  @Latihan
    Scenario: Delete user with valid user id
      Given Delete user with user id 2
      When  Send request delete user
      Then  Status code should be 204

