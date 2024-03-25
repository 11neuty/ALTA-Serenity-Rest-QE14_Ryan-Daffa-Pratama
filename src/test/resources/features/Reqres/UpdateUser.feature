Feature: Update user
  As user i can check method 'put' to update data

  @Tugas
  Scenario Outline: Update user with valid json and user id
    Given Update user with valid json <json> and user id <id>
    When Send request update user
    Then Status code should be <statusCode>
    And Response body name should be <name>
    And Validate json schema <json1>
    Examples:
      | json           | id | statusCode | name       | json1                       |
      | "Update.json"  | 1  | 200        | "morpheus" | "UpdateUserJsonSchema.json" |
      | "Update1.json" | 2  | 200        | "ryan"     | "UpdateUserJsonSchema.json" |


  @Tugas
  Scenario Outline: Update user with invalid json and user id
    Given Update user with invalid json <json> and user id <id>
    When Send request update user
    Then Status code should be <statusCode>
    Examples:
      | json                  | id | statusCode |
      | "InvalidUpdate.json"  | 1  | 400        |
      | "InvalidUpdate1.json" | 2  | 400        |
