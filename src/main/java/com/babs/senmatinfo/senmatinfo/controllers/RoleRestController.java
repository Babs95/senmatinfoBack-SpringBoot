package com.babs.senmatinfo.senmatinfo.controllers;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

import com.babs.senmatinfo.senmatinfo.models.Role;
import com.babs.senmatinfo.senmatinfo.repository.RoleRepository;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class RoleRestController {
    @Autowired
    private RoleRepository roleRepository;

    @GetMapping(value ="/role")
    public List<Role> findAll(){
        return  roleRepository.findAll();
    }
    
    @GetMapping(value = "/role/{id}")
    public Optional<Role> getOne(@PathVariable Long id){
        return  roleRepository.findById(id);
    }


    @PostMapping(value = "/role")
    public Role save(@RequestBody Role p){
        return roleRepository.save(p);
    }

    @DeleteMapping(value = "/role/{id}")
    public void delete(@PathVariable Long id){
        roleRepository.deleteById(id);
    }


    @PutMapping(value = "/role/{id}")
    public Role update(@RequestBody Role p, @PathVariable Long id){
        p.setId(id);
        return  roleRepository.save(p);
    }
}
