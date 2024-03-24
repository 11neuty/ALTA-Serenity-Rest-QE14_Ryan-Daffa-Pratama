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

public class LoginStepDef {
  @Steps
    ReqresAPI reqresAPI;

    @Given("User login with valid json {string}")
    public void userLoginWithValidAnd(String json) {
        File jsonFile = new File(Constants.REQ_BODY+json);
        reqresAPI.LoginEmailPassword(jsonFile);
    }

    @When("User send request to login")
    public void userSendRequestToLogin() {
        SerenityRest.when().post(reqresAPI.LOGIN_USERS);
    }

    @Given("User login with invalid json {string}")
    public void userLoginWithInvalidJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY+json);
        reqresAPI.LoginEmailPassword(jsonFile);
    }
}
