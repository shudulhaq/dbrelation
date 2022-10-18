package com.example.demo.controller;

import com.example.demo.model.Mahasiswa;
import com.example.demo.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MahasiswaController {
    @Autowired
    private MahasiswaRepository mahasiswa;

    @GetMapping("/getAllMahasiswa")
    public ResponseEntity<List<Mahasiswa>>getAllMahasiswa(){
        List<Mahasiswa>result = mahasiswa.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }


    @GetMapping("/getAllMahasiswa")
    public ResponseEntity<Object>getAllMahasiswa(@RequestParam int page, @RequestParam int size){
        Pageable request = PageRequest.of(page, size);

        Page<Mahasiswa> result = mahasiswa.findAll(request);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
