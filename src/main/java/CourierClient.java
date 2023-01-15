import static io.restassured.RestAssured.given;

import io.restassured.response.ValidatableResponse;

public class CourierClient {

    private

    public ValidatableResponse create(Courier courier) {
        return given()
                .spec()
                .body(courier)
                .when()
                .post("")
                .then;
    }

}
