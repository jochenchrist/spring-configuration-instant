package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    MyAppProperties myAppProperties;

    @Test
    public void contextLoads() {
    }

    @Test
    public void shouldParseTimeProperties() {
        assertNotNull(myAppProperties.getMyinstant());
        assertNotNull(myAppProperties.getMytimestamp());
    }
}
