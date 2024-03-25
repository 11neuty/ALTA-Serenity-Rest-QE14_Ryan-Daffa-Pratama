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

public class RegisterSingleUserStepDef {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Register data user with valid json {string}")
    public void registerUserWithValidJson(String json){
        File jsonFile = new File(Constants.REQ_BODY+json);
        reqresAPI.registerSingleUser(jsonFile);
    }

    @When("Send request register single user")
    public void sendRequestRegisterSingleUser() {
        SerenityRest.when().post(ReqresAPI.REGISTER_USERS);
    }

    @Given("User register data user with invalid json {string}")
    public void userRegisterReqressInWithInvalidJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY+json);
        reqresAPI.registerSingleUser(jsonFile);
    }


    @And("Response body id should be {int}")
    public void responseBodyShouldBe(int id) {
        SerenityRest.and().body(ReqresResponses.ID,equalTo(id));
    }
}
