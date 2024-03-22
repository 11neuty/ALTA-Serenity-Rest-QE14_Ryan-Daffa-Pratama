Feature: Positive and Negative test case get single method
  As user i can check the method 'get' to search single user
@Tugas
 Scenario: Get single user with valid parameter id
  Given Get data user with valid parameter id 1
  When Send request get single users
  Then Status code should be 200

@Tugas
 Scenario: Get single user with invalid parameter id
   Given Get data user with invalid parameter id 15
   When  Send request get single users
   Then  Status code should be 404


