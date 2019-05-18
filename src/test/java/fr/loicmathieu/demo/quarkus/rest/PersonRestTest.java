package fr.loicmathieu.demo.quarkus.rest;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.h2.H2DatabaseTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
@QuarkusTestResource(H2DatabaseTestResource.class)
public class PersonRestTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/persons")
          .then()
             .statusCode(200);
    }

}