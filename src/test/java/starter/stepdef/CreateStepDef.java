package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class CreateStepDef {
    @Steps
    ReqresAPI reqresAPI;
    @Given("Create user with valid json {string}")
    public void createUserWithValidJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY+json);
        reqresAPI.createUser(jsonFile);
    }

    @When("Send request create new user")
    public void sendRequestCreateNewUser() {
        SerenityRest.when()
                .post(ReqresAPI.CREATE_USERS);
    }



    @Given("Create user with invalid json {string}")
    public void createUserWithInvalidJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY+json);
        reqresAPI.createUser(jsonFile);
    }

    @And("Response body id should be {string}")
    public void responseBodyIdShouldBe(String name) {
        SerenityRest.and().body(ReqresResponses.NAME,equalTo(name));
    }
}
