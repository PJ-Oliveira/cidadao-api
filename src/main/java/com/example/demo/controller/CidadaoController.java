package com.example.demo.controller;
import com.example.demo.entity.Cidadao;
import com.example.demo.service.CidadaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CidadaoController {

    @Autowired
    private CidadaoService cidadaoService;

    @PostMapping("/save")
    public Cidadao addUser(@RequestBody Cidadao cidadao) {
        return cidadaoService.createUser(cidadao);
    }

    @GetMapping("/{id}")
    public Cidadao getUserById(@PathVariable int id) {
        return cidadaoService.getUserById(id);
    }

    @GetMapping("/cidadoes")
    public List<Cidadao> getAllUsers() {
        return cidadaoService.getAllUsers();
    }


    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        return cidadaoService.deleteUserById(id);
    }


}
