package Tests;

import TestDatalari.TestDataDummyExample;
import baseUrl.BaseUrlDummyExample;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C26_Get_TestDataClassKullanimi extends BaseUrlDummyExample {
    /*
        http://dummy.restapiexample.com/api/v1/employee/3 url’ine

        bir GET request gonderdigimizde

        donen response’un status code’unun 200,

        content Type’inin application/json

        ve body’sinin asagidaki gibi oldugunu test edin.

          Expected Response Body
            {
                "status":"success",
                "data":{
                        "id":3,
                        "employee_name":"Ashton Cox",
                        "employee_salary":86000,
                        "employee_age":66,
                        "profile_image":""
                        },
                "message":"Successfully! Record has been fetched."
            }
         */

    @Test
    public void test01() {
        // 1- endpoint ve request body hazirla
        specDummyExample.pathParams("pp1","employee","pp2","3");


        // 2- expected data olustur
        JSONObject expectedData= TestDataDummyExample.jsonResponseBodyOlustur(3,"Ashton Cox",86000,66,"");


        // 3- request gonderip, donen response'i kaydet
Response response= given().spec(specDummyExample).when().get("{pp1}/{pp2}");


        // 4- Assertion

    }
}
