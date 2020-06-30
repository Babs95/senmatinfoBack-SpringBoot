package com.babs.senmatinfo.senmatinfo.controllers;

import com.babs.senmatinfo.senmatinfo.models.User;
import com.babs.senmatinfo.senmatinfo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserRestController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value ="/user")
    public List<User> findAll(){
        return  userRepository.findAll();
    }

    @GetMapping(value = "/user/{id}")
    public Optional<User> getOne(@PathVariable Long id){
        return  userRepository.findById(id);
    }


    @DeleteMapping(value = "/user/{id}")
    public void delete(@PathVariable Long id){
        userRepository.deleteById(id);
    }


    @PutMapping(value = "/user/{id}")
    public User update(@RequestBody User p, @PathVariable Long id){
        p.setId(id);
        return  userRepository.save(p);
    }
}
