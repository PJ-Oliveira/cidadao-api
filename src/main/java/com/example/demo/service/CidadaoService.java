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

    public Cidadao createUser(Cidadao cidadao){
        return userRepository.save(cidadao);
    }

    public Cidadao getUserById(int id){
        return userRepository.findById(id).orElse(null);
    }

    public List<Cidadao> getAllUsers(){
        return userRepository.findAll();
    }

    public String deleteUserById(int id){
        userRepository.deleteById(id);
        return id + " deleted!";
    }

}
