package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class BaseTest {

    @BeforeClass
    public void setup() {
        System.out.println("==== SETUP ====");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("==== TEARDOWN ====");
    }

}
