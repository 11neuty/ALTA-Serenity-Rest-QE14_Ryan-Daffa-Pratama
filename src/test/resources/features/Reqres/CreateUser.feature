Feature: Create User
  As user i can create user with valid json and cant create user with invalid json

  @Tugas
  Scenario Outline: Post create single user with valid json
    Given Create user with valid json <json>
    When Send request create new user
    Then Status code should be <statusCode>
    And Response body id should be <name>
    And Validate json schema <json1>
    Examples:
      | json                | statusCode | name       | json1                    |
      | "ValidCreate.json"  | 201        | "morpheus" | "ValidCreateSchema.json" |
      | "ValidCreate1.json" | 201        | "ryan"     | "ValidCreateSchema.json" |
      | "ValidCreate2.json" | 201        | "bambang"  | "ValidCreateSchema.json" |


  @Tugas
  Scenario: Post create single user with invalid json
    Given Create user with invalid json "InvalidCreate.json"
    When  Send request create new user
    Then  Status code should be 400


