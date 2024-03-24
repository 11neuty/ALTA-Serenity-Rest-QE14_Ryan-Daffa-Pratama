package starter.reqres;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.utils.Constants;

import java.io.File;

public class ReqresAPI {


    public static String LIST_USERS = Constants.BASE_URL + "/api/users?page={page}";
    public static String CREATE_USERS = Constants.BASE_URL + "/api/users";
    public static String UPDATE_USERS = Constants.BASE_URL + "/api/users/{id}";

    public static String DELETE_USERS = Constants.BASE_URL + "/api/users/{id}";

    public static  String SINGLE_USERS = Constants.BASE_URL + "/api/users/{id}";

    public static String LOGIN_USERS = Constants.BASE_URL + "/api/login";

    public static String REGISTER_USERS = Constants.BASE_URL + "/api/register";



    @Step("Get list user with valid parameter page")
    public void getListUsers(int page){
        SerenityRest.given()
                .pathParam("page", page);
    }

    @Step("Post create user with valid json")
    public void postCreateUsers(File json){
    SerenityRest.given()
            .contentType(ContentType.JSON).body(json);
    }

    @Step("Update user with valid json and user id")
    public void putUpdateUsers(int id, File json){
        SerenityRest.given()
                .pathParam("id", id)
                .contentType(ContentType.JSON).body(json);
    }
    @Step("Delete user with valid user id")
    public void deleteUser(int id){
        SerenityRest.given()
                .pathParam("id",id);
    }

    @Step("Get single user with valid user id")
    public void getSingleUser(int id){
        SerenityRest.given().pathParam("id", id);
    }

    @Step("User login with valid json")
    public void  LoginEmailPassword(File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON).body(json);
    }

    @Step ("Register data user with valid json")
    public void registerSingleUser(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }

    @Step("Create user with valid json")
    public void createUser(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }
}


