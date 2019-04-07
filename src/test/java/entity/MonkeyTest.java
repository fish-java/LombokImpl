package entity;


import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.Date;

public class MonkeyTest {
    @Test
    public void lombok(){
        Monkey monkey = new Monkey(12, "Jon", new Date());
        monkey.setName("Jon Snow");
        System.out.println(JSONObject.toJSONString(monkey));
    }
}
