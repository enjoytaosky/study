package com.example.study.controller.user;

import com.example.study.StudyApplicationTests;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class UserControllerTest extends StudyApplicationTests {

    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }


    @Test
    public void getUserList() throws Exception {
        RequestBuilder request = null;
        // 1、get查一下user列表，应该为空
        request = MockMvcRequestBuilders.get("/user/list");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("[{\"userCode\":\"0001\",\"userName\":\"taotao\"}]"));
    }
}