package com.dejan.dejan.controller;


import com.dejan.dejan.repository.HomeRepository;
import com.dejan.dejan.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    HomeRepository homeRepository;

    @GetMapping(value = "/all")
    public List<User> getAll() {
        return homeRepository.findAll();
    }

    @GetMapping(value = "/{name}")
    public List<User> getUser(@PathVariable("name") final String name) {
        return homeRepository.findByName(name);
    }

    @GetMapping(value = "/id/{id}")
    public User getId(@PathVariable("id") final Integer id) {
        return homeRepository.findOne(id);
    }

    @GetMapping("/update/{id}/{name}")
    public User update(@PathVariable("id") final Integer id, @PathVariable("name")
    final String name) {

        User users = getId(id);
        users.setName(name);

        return homeRepository.save(users);
    }

    @PostMapping(value = "/user", consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public User save(@RequestBody User user) {
    return homeRepository.save(user);
}

}
