package com.students.profile.controller;

import com.students.profile.services.ResultFetcher;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProfileController.class)
public class ProfileControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockitoBean
    private ResultFetcher resultFetcher;

    @Test
    void getProfile_ReturnsProfile() throws Exception {
        mockMvc.perform(get("/student/0")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.fName").value("demo-user"))
                .andExpect(jsonPath("$.email").value("demo@gmail.com"));
    }
    @Test
    void getProfile_NotFound() throws Exception {
        mockMvc.perform(get("/student/2")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }
}
