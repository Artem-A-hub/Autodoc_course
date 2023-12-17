/*Дз. Написать API тест с использованием Pojo
Post запрос
Base uri https://reqres.in/
Request
/api/users
{  "name": "morpheus",
    "job": "leader"
}
    Response
    201
{
    "name": "morpheus",
    "job": "leader",
    "id": "977",
    "createdAt": "2023-10-06T18:23:01.666Z"
}*/

package homework31;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ApiTest {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testPostRequest() {
        RestAssured.baseURI = BASE_URL;

        User user = new User();
        user.setName("morpheus");
        user.setJob("leader");

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(user)
                .post("/api/users");

        response.then()
                .statusCode(201)
                .contentType(ContentType.JSON)
                .extract().response();

        System.out.println("User ID: " + response.path("id"));
        System.out.println("Created At: " + response.path("createdAt"));
    }
}