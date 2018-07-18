package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@ConfigurationProperties("myapp")
public class MyAppProperties {

    Instant myinstant;
    Instant mytimestamp;

    public Instant getMyinstant() {
        return myinstant;
    }

    public void setMyinstant(Instant myinstant) {
        this.myinstant = myinstant;
    }

    public Instant getMytimestamp() {
        return mytimestamp;
    }

    public void setMytimestamp(Instant mytimestamp) {
        this.mytimestamp = mytimestamp;
    }
}
