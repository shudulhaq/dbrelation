package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "mst_matakuliah")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Matakuliah {
    @Id
    private String id_matkul;
    private String nama_matkul;
    private String semester;

    @ManyToOne
    @JoinColumn(name = "id_dosen")
    @JsonBackReference
    private Dosen pakDosen;

    @ManyToOne
    @JoinColumn(name = "nim")
    @JsonBackReference
    private Mahasiswa mahasiswa;
}
