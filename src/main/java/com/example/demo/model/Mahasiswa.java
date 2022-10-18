package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "mst_mahasiswa")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Mahasiswa {

    @Id
    private String nim;
    private String nama;
    private String prodi;
    private String fakultas;

    @OneToMany(mappedBy = "mahasiswa")
    private List<Matakuliah> listMatakuliah;

    @ManyToOne
    @JoinColumn(name = "id_dosen")
    @JsonBackReference
    private Dosen pakDosen;
}
