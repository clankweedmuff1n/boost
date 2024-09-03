package com.blazing.boost.telegram;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/api/v1"))
public class TelegramController {
    @GetMapping("/test")
    public String test() {
        System.out.println("TEST 123");
        return "Test";
    }
}
