Feature: Register Successful
  As user i can register with valid email and password
  Scenario: Post register with valid json
    Given Register data user with valid json "RegisterValid.json"
    When  Send request register single user
    Then  Status code should be 200
    And   Response body id should be 4
    And   Validate json schema "RegisterSingleSchema.json"


    Scenario: Post register with invalid json
      Given User register reqress.in with invalid json "registerInvalid.json"
      When  Send request register single user
      Then  Status code should be 400