package com.eujian.jasypt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JasyptApplicationTests {

    @Value("${demo.username}")
    private String username;

    @Value("${demo.password}")
    private String password;
    @Test
    void contextLoads() {
        System.out.println("username="+username);
        System.out.println("password="+password);
    }

}
