package com.raghu;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.raghu.controller.HomeRestcontroller;

@WebMvcTest(HomeRestcontroller.class)
public class HomeRestcontrollerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetMessage() throws Exception {
        String name = "John";
        String expectedResponse = "Good Morning! " + name + "  Today Date is " + LocalDate.now();

        mockMvc.perform(get("/get/{name}", name))
                .andExpect(status().isOk())
                .andExpect(content().string(expectedResponse));
    }
}