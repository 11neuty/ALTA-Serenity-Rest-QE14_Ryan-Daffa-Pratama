Feature: Get single user
  As user i can get single user with valid parameter id and cant get single user with invalid parameter id
@Tugas
#  Positive test case
 Scenario: Get single user with valid parameter id
  Given Get data user with valid parameter id 1
  When  Send request get single users
  Then  Status code should be 200
  And   Response body data should be 1
  And   Validate json schema "GetSingleUser.json"

@Tugas
#  Negative test case
 Scenario: Get single user with invalid parameter id
   Given Get data user with invalid parameter id 79
   When  Send request get single users
   Then  Status code should be 404



