Feature: LOGIN
  As user i can login with valid email & password and cant login with invalid email
#POSITIVE
  Scenario: Login with valid json
    Given User login with valid json "login.json"
    When  User send request to login
    Then  Status code should be 200
    And   Validate json schema "LoginValidSchema.json"

#NEGATIVE
  Scenario: Login with invalid email json
    Given User login with invalid json "InvalidLogin.json"
    When  User send request to login
    Then  Status code should be 400
