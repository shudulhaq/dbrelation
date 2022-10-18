package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "mst_jadwalkuliah")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Jadwalkuliah {

    @Id
    private String id;
    private String hari;
    private String jam;

    @ManyToOne
    @JoinColumn(name = "nim")
    @JsonBackReference
    private Mahasiswa mahasiswa;

    @OneToOne
    @JoinColumn(name = "id_matkul")
    @JsonBackReference
    private Matakuliah matakuliah;
}
