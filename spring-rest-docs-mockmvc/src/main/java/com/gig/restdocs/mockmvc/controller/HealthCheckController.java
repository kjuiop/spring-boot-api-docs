package com.gig.restdocs.mockmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : JAKE
 * @date : 2022/10/16
 */
@RestController
public class HealthCheckController {

    @GetMapping("/health-check")
    public String healthCheck() {
        return "Status is ok";
    }

}
