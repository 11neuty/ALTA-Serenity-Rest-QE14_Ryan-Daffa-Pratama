Feature: Delete User
  As user i can check method 'delete' to delete data
  @Tugas
  #Positive Test Case
  Scenario Outline: Delete user with valid user id
    Given Delete user with user id <id>
    When Send request delete user
    Then Status code should be <statusCode>
    Examples:
      | id | statusCode |
      | 10 | 204        |
      | 9  | 204        |

  @Tugas
  #Negative Test Case
  Scenario Outline: Delete user with invalid user id
    Given Delete user with user id <id>
    When Send request delete user
    Then Status code should be <statusCode>
    Examples:
      | id | statusCode |
      | 95 | 204        |
      | 99 | 204        |


