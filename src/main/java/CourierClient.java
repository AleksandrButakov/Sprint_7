import static io.restassured.RestAssured.given;

import io.restassured.response.ValidatableResponse;

import java.awt.datatransfer.Clipboard;

public class CourierClient extends Client {

    private static final String PATH = "api/v1/courier";

    public ValidatableResponse create(Courier courier) {
        return given()
                .spec(getSpec())
                .body(courier)
                .when()
                .post(PATH)
                .then();
    }

    public ValidatableResponse login(CourierCredentials credentials) {

    }

    public ValidatableResponse delete(int id) {
        return given()
                .spec(getSpec())
                .body(courier)
                .when()
                .post();

    }

}
