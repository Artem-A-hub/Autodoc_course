package lesson31.registration;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;

public class TestSuccessRegWithoutPojo {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testSuccessReg(){
        installSpec(requestSpecification(BASE_URL),
                responseSpecification(200));
        Map<String, String> bodyMap = new HashMap<>();
        bodyMap.put("email", "eve.holt@reqres.in");
        bodyMap.put("password", "pistol");
        Response response = given()
                .body(bodyMap)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().response();
        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.get("id");
        String token = jsonPath.get("token");
        Assert.assertEquals(id, 4);
        Assert.assertEquals(token, "QpwL5tke4Pnpja7X4");
    }
}