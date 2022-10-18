package com.example.demo.controller;

import com.example.demo.model.Matakuliah;
import com.example.demo.repository.MatakuliahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MatakuliahController {

    @Autowired
    private MatakuliahRepository matakuliah;

    @GetMapping("/getAllMatakuliah")
    public ResponseEntity<List<Matakuliah>>getAllMatakuliah(){
        List<Matakuliah> result = matakuliah.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
