package tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class GetAndPostExamples extends BaseTest {

    @Test
    public void testGet() {
        // https://www.youtube.com/watch?v=EvG8r7AhanI&list=PLhW3qG5bs-L8xPrBwDv66cTMlFNeUPdJx&index=6
        String baseUri = "https://reqres.in/api";
        String endPoint = "/users?page=2";
        String url = baseUri+endPoint;
        int expectedStatusCode = 200;
        String expectedName = "George";

        RestAssured.given().
                    get(url).
                then().
                    statusCode(expectedStatusCode).
                    body("data[4].first_name", Matchers.equalTo(expectedName));

    }

    @Test
    public void testPost() {
        // https://www.youtube.com/watch?v=EvG8r7AhanI&list=PLhW3qG5bs-L8xPrBwDv66cTMlFNeUPdJx&index=6
        String baseUri = "https://reqres.in/api";
        String url = baseUri+"/users";
        int expectedStatusCode = 201;
        JSONObject request = new JSONObject();

        //Setup Json
        request.put("name", "Stefan");
        request.put("job", "SDET");

        RestAssured.given().
                    header("Content-Type","application/json").
                    contentType(ContentType.JSON).
                    accept(ContentType.JSON).
                    body(request.toJSONString()).
                when().
                    post(url).
                then().
                    statusCode(expectedStatusCode);
    }
}
