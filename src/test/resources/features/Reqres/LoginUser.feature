Feature: Login user
  As user i can login with valid email & password and cant login with invalid email

  @Tugas
  Scenario Outline: Login with valid json
    Given User login with valid json <json>
    When  User send request to login
    Then  Status code should be <statusCode>
    And   Validate json schema <json1>
    Examples:
      | json               | statusCode | json1                   |
      | "LoginValid.json"  | 200        | "LoginValidSchema.json" |
      | "LoginValid1.json" | 200        | "LoginValidSchema.json" |


  @Tugas
  Scenario Outline: Login with invalid email json
    Given User login with invalid json <json>
    When User send request to login
    Then Status code should be <statusCode>
    Examples:
      | json                 | statusCode |
      | "InvalidLogin.json"  | 400        |
      | "InvalidLogin1.json" | 400        |
      | "InvalidLogin2.json" | 400        |

