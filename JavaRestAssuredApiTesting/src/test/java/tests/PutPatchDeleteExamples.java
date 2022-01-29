package tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutPatchDeleteExamples extends BaseTest {

    @Test
    public void testPut() {
        // https://www.youtube.com/watch?v=QDp7EQga3ME&list=PLhW3qG5bs-L8xPrBwDv66cTMlFNeUPdJx&index=7
        String baseUri = "https://reqres.in/api";
        String url = baseUri+"/users/2";
        int expectedStatusCode = 200;
        JSONObject request = new JSONObject();

        //Setup Json
        request.put("name", "Stefan");
        request.put("job", "SDET");

        RestAssured.
             given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
            when().
                put(url).
            then().
                statusCode(expectedStatusCode);


    }

    @Test
    public void testPost() {


    }
}
