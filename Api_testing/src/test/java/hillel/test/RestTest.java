package hillel.test;

import hillel.test.dto.Data;
import hillel.test.dto.FullUserInfo;
import hillel.test.dto.User;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RestTest {

    private static RequestSpecification requestSpecification;

    @BeforeAll
    static void init() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
                .setContentType(ContentType.JSON)
//                .addFilter(new RequestLoggingFilter())
//                .addFilter(new ResponseLoggingFilter())
                .build();
    }

    @Test
    void getUser() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .get("api/users/2")
                .thenReturn();
        response.then().statusCode(200);
        response.print();
    }

    @Test
    void getUsers() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .param("page", 2)
                .get("/api/users")
                .thenReturn();
        response.then().statusCode(200);
    }

    @Test
    void createUser() {
        User expected = User
                .builder()
                .name("morpheus")
                .job("leader")
                .build();

        User user1 = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .body(expected)
                .post("api/users")
                .then()
                .statusCode(201)
                .contentType(ContentType.JSON)
                .extract()
                .as(User.class);

        assertThat(user1).isEqualToIgnoringGivenFields(expected,"id", "createdAt");
        Assertions.assertEquals(user1.getName(), expected.getName());
        Assertions.assertEquals(user1.getJob(), expected.getJob());
    }

    @Test
    void getUser2() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .get("api/users/2")
                .thenReturn();

        response.then().statusCode(200);

        Data data = response.then()
                .extract()
                .body()
                .jsonPath()
                .getObject("data", Data.class);

        String id = response.then()
                .extract()
                .body()
                .jsonPath()
                .getString("data.id");

        response.print();
    }

    @Test
    void getUsers1() {
        String id = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .param("page", 2)
                .get("/api/users")
                .then()
                .extract()
                .body()
                .jsonPath()
                .getString("data[0].id");
        System.out.println(id);
    }

    @Test
    void getUsers2() {
        FullUserInfo fullUserInfo = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .get("/api/users/2")
                .then()
                .extract()
                .as(FullUserInfo.class);
        System.out.println(fullUserInfo);
    }
}
