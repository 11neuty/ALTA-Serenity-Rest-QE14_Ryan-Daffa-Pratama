Feature: Serenity Rest QE 14

  Scenario Outline: Get list user with valid parameter page
    Given Get list user with parameter page <page>
    When Send request get list users
    Then Status code should be <statusCode>
    Examples:
      | page | statusCode |
      | 2    | 200        |
      | 1    | 200        |
      | 3    | 200        |

Scenario: Post create user with valid json
  Given Create user with valid json "CreateUser.json"
  When  Send request create new user
  Then  Status code should be 201
