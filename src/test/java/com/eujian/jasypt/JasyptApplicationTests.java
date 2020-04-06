package com.eujian.jasypt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JasyptApplicationTests {

    @Value("${demo.username}")
    private String username;

    @Value("${demo.password}")
    private String password;
    @Test
    public void contextLoads() {
        System.out.println("username="+username);
        System.out.println("password="+password);
    }

}
