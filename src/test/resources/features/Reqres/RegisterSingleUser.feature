Feature: Register user
  As user i can register with valid email and password
  @Tugas
  #Positive Test Case
  Scenario Outline: Post register with valid json
    Given Register data user with valid json <json>
    When Send request register single user
    Then Status code should be <statusCode>
    And Response body id should be <id>
    And Validate json schema <json1>
    Examples:
      | json                  | statusCode | id | json1                       |
      | "RegisterValid.json"  | 200        | 4  | "RegisterSingleSchema.json" |
      | "RegisterValid1.json" | 200        | 2  | "RegisterSingleSchema.json" |

  @Tugas
  Scenario Outline: Post register with invalid json
    Given User register data user with invalid json <json>
    When Send request register single user
    Then Status code should be <statusCode>
    Examples:
      | json                    | statusCode |
      | "registerInvalid.json"  | 400        |
      | "registerInvalid1.json" | 400        |