package org.Mercury.api;

import org.Mercury.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserApi {
    @GetMapping("query")
    public User queryUser(@RequestParam("username") String username, @RequestParam("password") String password);
}
