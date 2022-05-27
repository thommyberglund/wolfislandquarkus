package dev.thommy.controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
@QuarkusTest
class GreetingControllerTest {
    @Test
    public void helloEndpoint() {
        given()
                .when().get("/wolfisland")
                .then()
                .statusCode(200)
                .body(is("hello"));
    }

}