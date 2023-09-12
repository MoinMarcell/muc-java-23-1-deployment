package de.neuefische.backend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnHelloWorld() throws Exception {
        this.mockMvc.perform(get("/hello-world"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World!"));
    }
}