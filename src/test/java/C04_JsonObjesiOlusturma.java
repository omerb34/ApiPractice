
import org.json.JSONObject;
import org.junit.Test;

public class C04_JsonObjesiOlusturma {

    @Test
    public void test01 () {

        /* JSon abjesi aşağıdaki gibidir. Dataları göndermenin birden fazla yolu vardır. birisi de jsondur.

        {
            "title":"Ahmet",
            "body":"Merhaba",
            "userId":1
        }
         */

        JSONObject obj1=new JSONObject();
        obj1.put("title","Ahmet");
        obj1.put("body","Merhaba");
        obj1.put("userId",1);
        System.out.println("obj1 = " + obj1);
    }
}
