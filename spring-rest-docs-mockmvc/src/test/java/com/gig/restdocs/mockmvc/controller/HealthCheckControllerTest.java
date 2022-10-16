package com.gig.restdocs.mockmvc.controller;

import com.gig.restdocs.mockmvc.document.RestDocsTestSupport;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author : JAKE
 * @date : 2022/10/16
 */
@WebMvcTest(HealthCheckController.class)
class HealthCheckControllerTest extends RestDocsTestSupport {

    @DisplayName("Service Api 헬스체크_테스트")
    @Test
    public void healthCheckTest() throws Exception {
        // given

        // when
        ResultActions result = mockMvc.perform(get("/api/health-check")
                .contentType(MediaType.APPLICATION_JSON));

        // then
        result.andExpect(status().isOk())
                .andExpect(content().string("Status is ok"))
        ;
    }
}