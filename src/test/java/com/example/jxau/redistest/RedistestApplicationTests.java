package com.example.jxau.redistest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RedistestApplicationTests {

    @Test
    void contextLoads() {
        String id = "FakeLive-459333127714635776";
        String str1 = id.substring(0, 9);
        String terminalId = id.substring(str1.length(), id.length());
        System.out.println(str1);
        System.out.println(terminalId);
    }

}
