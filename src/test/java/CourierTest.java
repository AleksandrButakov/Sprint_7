import io.restassured.response.ValidatableResponse;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.apache.http.HttpStatus.SC_OK;
import static org.junit.Assert.assertEquals;

public class CourierTest {

    private Courier courier;
    private CourierClient courierClient;
    private int id;

    @Before
    public void setUp() {
        courier = CourierGenerator.getDefault();
        courierClient = new CourierClient();
    }

    @After
    public void cleanUp() {
        //courierClient.delete(id);
    }

    @Test
    public void courierCanBeCreated() {
        ValidatableResponse response = courierClient.create(courier);
        ValidatableResponse loginResponse = courierClient.login(CourierCredentials.from(courier));
        id = loginResponse.extract().path("id");

        // String statusCode = response.extract().path("message");
        int statusCode = response.extract().statusCode();
        assertEquals(SC_OK, response);
    }

}