package com.example.demo.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "mst_dosen")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Dosen {

    @Id
    private String id_dosen;
    private String nama_dosen;
    @Column(name = "pendidikan_terakhir")
    private String pendidikan;

    @OneToMany(mappedBy = "pakDosen")
    private List<Matakuliah> listMatakuliah;
}
