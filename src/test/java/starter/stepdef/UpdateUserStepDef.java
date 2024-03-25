package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import java.io.File;
import static org.hamcrest.Matchers.equalTo;

public class UpdateUserStepDef {
    @Steps
    ReqresAPI reqresAPI;
    @Given("Update user with valid json {string} and user id {int}")
    public void updateUserWithValidJsonAndUserId(String json, int id) {
        File jsonFile = new File(Constants.REQ_BODY+json);
        reqresAPI.putUpdateUsers(id, jsonFile);
    }
    @When("Send request update user")
    public void sendRequestUpdateUser() {
        SerenityRest.when().put(ReqresAPI.UPDATE_USERS);
    }

    @An("Response body name should be {string}")
    public void responseBodyNameShouldBe(String name){
        SerenityRest.and().body(ReqresResponses.NAME,equalTo(name));
    }


    @Given("Update user with invalid json {string} and user id {int}")
    public void updateUserWithInvalidJsonAndUserId(String json, int id) {
        File jsonFile = new File(Constants.REQ_BODY+json);
        reqresAPI.putUpdateUsers(id,jsonFile);
    }
}
