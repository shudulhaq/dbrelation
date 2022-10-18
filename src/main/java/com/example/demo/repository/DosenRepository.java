package com.example.demo.repository;

import com.example.demo.model.Dosen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DosenRepository extends JpaRepository<Dosen, String> {
}
