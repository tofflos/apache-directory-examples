package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ApplicationTest {

    private static Application application;

    @BeforeAll
    public static void beforeAll() throws Exception {
        application = new Application();
        application.start();
    }

    @AfterAll
    public static void afterAll() throws Exception {
        if (application != null) {
            application.stop();
        }
    }

    @Test
    public void helloWorld() throws Exception {
        fail("Not yet implemented...");
    }
}
