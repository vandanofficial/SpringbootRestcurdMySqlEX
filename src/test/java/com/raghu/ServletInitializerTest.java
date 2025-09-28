package com.raghu;

import org.junit.jupiter.api.Test;
import org.springframework.boot.builder.SpringApplicationBuilder;

import static org.junit.jupiter.api.Assertions.*;

public class ServletInitializerTest {

    @Test
    void testConfigure() {
        ServletInitializer initializer = new ServletInitializer();
        SpringApplicationBuilder builder = new SpringApplicationBuilder();
        
        SpringApplicationBuilder result = initializer.configure(builder);

        // Assert that the builder is not null
        assertNotNull(result);

        // Optionally assert that the sources include your main class
       // assertTrue(result.application().getAllSources().contains(SpringbootRestcurdMySqlExApplication.class));
    }
}
