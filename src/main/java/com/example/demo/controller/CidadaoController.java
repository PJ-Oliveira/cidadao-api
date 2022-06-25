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
    public Cidadao addCidadao(@RequestBody Cidadao cidadao) {
        return cidadaoService.create(cidadao);
    }

    @GetMapping("/{id}")
    public Cidadao getCidadaoById(@PathVariable int id) {
        return cidadaoService.getById(id);
    }

    @GetMapping("/cidadoes")
    public List<Cidadao> getAll() {
        return cidadaoService.getAll();
    }


    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id) {
        return cidadaoService.deleteUserById(id);
    }


}
