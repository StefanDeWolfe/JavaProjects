package demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class TestDemoFail extends BaseTest {

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
        Assert.assertEquals((int)statusCode,201);

    }

}
