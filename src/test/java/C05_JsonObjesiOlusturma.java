import org.json.JSONObject;
import org.junit.Test;

public class C05_JsonObjesiOlusturma {
    @Test
    public void test02() {
        /* Aşağıdaki bilgiler ile bir json objesi oluşturunuz.

        {
            "firstname":"Jim",
            "additionalneeds":"Breakfast",
            "bookingdates":{
                    "checkin":"",
                    "":"2019-01-01"
             },
            "totalprice":111,
            "depositpaid":true,
            "lastname":"Brown"
        }
         */

//      öncelikle içerdeki inner olan Json objesini oluşturmalıyız..
        JSONObject dataJsonObject = new JSONObject();
        dataJsonObject.put("checkin","2018-01-01");
        dataJsonObject.put("checkout","2019-01-01");

//      sonra en dışatiki olusturup inner olanı içine koyacağız..

        JSONObject requestbody= new JSONObject();
        requestbody.put("firstname","Jim");
        requestbody.put("additionalneeds","Breakfast");
        requestbody.put("bookingdates",dataJsonObject);
        requestbody.put("totalprice",111);
        requestbody.put("depositpaid",true);
        requestbody.put("lastname","Brown");

        System.out.println("requestbody = " + requestbody);
    }
}
