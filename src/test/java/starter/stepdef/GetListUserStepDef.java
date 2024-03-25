package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class GetListUserStepDef {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Get data user with valid parameter page {int}")
    public void getDataUserWithValidParameterPage(int page) {
        reqresAPI.getListUsers(page);
    }
    @When("Send request get list users")
    public void sendRequestGetListUsers() {
        SerenityRest.when()
                .get(ReqresAPI.LIST_USERS);
    }

    @And("Response body data page should be {int}")
    public void responseBodyDataShouldBe(int page) {
        SerenityRest.and().body(ReqresResponses.PAGE, equalTo(page));
    }



    @Given("Get data user with invalid parameter page {int}")
    public void getDataUserWithInvalidParameterPage(int page) {
       reqresAPI.getListUsers(page);
    }


}
