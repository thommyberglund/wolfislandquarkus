package dev.thommy.controller;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@TestHTTPEndpoint(ArmyController.class)
class ArmyControllerTest {


    @Test
    public void helloEndpoint() {
        when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hello from army controller"));
    }
}