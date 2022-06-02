package com.nya.controller;

import com.nya.domain.User;
import com.nya.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

//    @PutMapping
//    public Boolean update(@RequestBody User user) {
//        return userService.update(user);
//    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id) {
        return userService.removeById(id);
    }
}
