package com.nya.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.nya.domain.User;
import com.nya.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping
    public List<User> getAll() {
        return userService.list();
    }

    @GetMapping("{id}")
    public User getByID(@PathVariable Integer id) {
        return userService.getById(id);
    }

    @PostMapping
    public Boolean save(@RequestBody User user) {
        return userService.save(user);
    }
    @PostMapping("/login")
    public Integer login(@RequestBody Map<String, String> map) {
        System.out.println(map.get("phone"));
        return userService.login(map.get("phone"), map.get("password"));
    }

//    @PutMapping
//    public Boolean update(@RequestBody User user) {
//        return userService.update(user);
//    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id) {
        return userService.removeById(id);
    }
}
