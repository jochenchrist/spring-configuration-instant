package com.example.demo;

import org.junit.Test;

import java.time.Instant;

import static org.junit.Assert.*;

public class StringToInstantConverterTest {

    @Test
    public void shouldParseInstant() {
        Instant instant = new StringToInstantConverter().convert("2017-07-01T00:00:00.000Z");
        assertNotNull(instant);

    }
}