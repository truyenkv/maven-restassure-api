package GET;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request {
	
	@Test
    void getWeatherDetail(){
        //specify base URL
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

        //Request Object
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "/Hyderadad");
        String responseBody =  response.getBody().asString();
        System.out.println("Response body: " + responseBody);
    }
}
