package com.gig.restdocs.mockmvc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Disabled;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author : JAKE
 * @date : 2022/10/16
 */
@Disabled
public class ControllerTest {

    protected MockMvc mockMvc;

    protected ObjectMapper objectMapper;

    protected String createJson(Object dto) throws JsonProcessingException {
        return objectMapper.writeValueAsString(dto);
    }

}
