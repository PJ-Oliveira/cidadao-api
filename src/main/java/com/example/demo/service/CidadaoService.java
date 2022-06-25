package com.example.demo.service;

import com.example.demo.entity.Cidadao;
import com.example.demo.repo.CidadaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadaoService {
    @Autowired
    private CidadaoRepository userRepository;

    public Cidadao create(Cidadao cidadao){
        return userRepository.save(cidadao);
    }

    public Cidadao getById(int id){
        return userRepository.findById(id).orElse(null);
    }

    public List<Cidadao> getAll(){
        return userRepository.findAll();
    }

    public String deleteUserById(int id){
        userRepository.deleteById(id);
        return id + " deleted!";
    }

}
