package dev.thommy.entity;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
@QuarkusTest
class GreetingEntityTest {
    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/wolfisland")
                .then()
                .statusCode(200)
                .body(is("hello"));
    }

}