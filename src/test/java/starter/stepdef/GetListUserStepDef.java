package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

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



    @Given("Get data user with invalid parameter page {int}")
    public void getDataUserWithInvalidParameterPage(int page) {
       reqresAPI.getListUsers(page);
    }


}
