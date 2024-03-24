package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import java.io.File;
import static org.hamcrest.Matchers.equalTo;

public class ReqresStepDef {
    @Steps
    ReqresAPI reqresAPI;

    //Schenario 1

//    @Given("Get list user with parameter page {int}")
//    public void getListUserWithParameterPage(int page) {
//        reqresAPI.getListUsers(page);
//    }






    //SCHENARIO 2

//    @Given("Create user with valid json {string}")
//    public void createUserWithValidJson(String json) {
//        File jsonFile = new File(Constants.REQ_BODY+json);
//        reqresAPI.postCreateUsers(jsonFile);
//    }

//    @When("Send request create new user")
//    public void sendRequestCreateNewUser() {
//        SerenityRest.when()
//                .post(ReqresAPI.CREATE_USERS);
//    }
    @And("Response body name should be {string} and job is {string}")
    public void responseBodyNameShouldBeAndJobIs(String name, String job) {
        SerenityRest.and()
                .body(ReqresResponses.NAME,equalTo(name))
                .body(ReqresResponses.JOB, equalTo(job));

    }

//    @Given("Update user with valid json {string} and user id {int}")
//    public void updateUserWithValidJsonAndUserId(String json, int id) {
//        File jsonFile = new File(Constants.REQ_BODY+json);
//        reqresAPI.putUpdateUsers(id, jsonFile);
//    }

//    @When("Send request update user")
//    public void sendRequestUpdateUser() {
//        SerenityRest.when().put(ReqresAPI.UPDATE_USERS);
//    }

    @Given("Delete user with user id {int}")
    public void deleteUserWithUserId(int id) {
        reqresAPI.deleteUser(id);

    }

    @When("Send request delete user")
    public void sendRequestDeleteUser() {
        SerenityRest.when().delete(ReqresAPI.DELETE_USERS);
    }

    @Given("Get list user with parameter page {}")
    public void getListUserWithParameterPage(int page) {
        reqresAPI.getListUsers(page);
    }
//    @When("Send request get list users")
//    public void sendRequestGetListUsers() {
//        SerenityRest.when()
//                .get(ReqresAPI.LIST_USERS);
//    }

    @And("Response body page should be {int}")
    public void responseBodyPageShouldBe(int page) {
        SerenityRest.and().body(ReqresResponses.PAGE,equalTo(page));
    }



}
