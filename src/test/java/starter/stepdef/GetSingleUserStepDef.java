package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.ReqresResponses;
import static org.hamcrest.Matchers.equalTo;


public class GetSingleUserStepDef {
    @Steps
    ReqresAPI reqresAPI;
    @Given("Get data user with valid parameter id {int}")
    public void getDataUserWithValidParameterId(int id) {
        reqresAPI.getSingleUser(id);
    }

    @When("Send request get single users")
    public void sendRequestGetSingleUsers() {
        SerenityRest.when().get(ReqresAPI.SINGLE_USERS);
    }

    @And("Response body data should be {int}")
    public void responseBodyDataShouldBe(int page) {
        SerenityRest.and().body(ReqresResponses.DATA_ID, equalTo(page));
    }



    @Given("Get data user with invalid parameter id {int}")
    public void getDataUserWithInvalidParameterId(int id) {
        reqresAPI.getSingleUser(id);
    }


}
