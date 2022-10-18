package com.example.demo.controller;

import com.example.demo.model.Dosen;
import com.example.demo.repository.DosenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DosenController {
    @Autowired
    private DosenRepository repository;

    @GetMapping("/getAllDosen")
    public ResponseEntity<List<Dosen>> getAllDosen(){
        List<Dosen> result = repository.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
