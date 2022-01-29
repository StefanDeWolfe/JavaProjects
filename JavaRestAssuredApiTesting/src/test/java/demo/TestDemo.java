package demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.core.IsEqual;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class TestDemo extends BaseTest {

    @Test
    public void test1() {
        String url = "https://reqres.in/api/users?page=2";
        Response response = null;
        Integer statusCode = null;
        Long responseTime = null;

        response = RestAssured.get(url);
        statusCode = response.getStatusCode();
        responseTime = response.getTime();

        System.out.println("Status Code: " + statusCode.toString());
        System.out.println("Status Line: " + response.getStatusLine());
        System.out.println("Response Time: " + responseTime.toString());
        System.out.println("Content Type: " + response.getHeader("content-type"));
        Assert.assertEquals((int)statusCode,200);

    }

    @Test
    public void test2() {
        // https://www.youtube.com/watch?v=iXQimBnjgfc&list=PLhW3qG5bs-L8xPrBwDv66cTMlFNeUPdJx&index=5
        String baseUri = "https://reqres.in";
        String url = baseUri+"/api/users?page=2";
        int expectedStatusCode = 200;
        int expectedValue = 8;

        RestAssured.
                given().
                    get(url).
                then().
                    statusCode(expectedStatusCode).
                    body("data.id[1]", IsEqual.equalTo(expectedValue));

    }

    @Test
    public void test3() {
        // https://www.youtube.com/watch?v=EvG8r7AhanI&list=PLhW3qG5bs-L8xPrBwDv66cTMlFNeUPdJx&index=6

    }
}
