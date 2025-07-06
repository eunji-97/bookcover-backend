package com.bookcover.domain.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "users", value = "/app/users")
@Slf4j
public class UserController {

    @GetMapping("login")
    public void login() {
        log.info("login!");
    }

    @GetMapping("join")
    public void join() {
        log.info("join!");
    }
}
