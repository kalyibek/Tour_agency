package com.example.touragency.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tour_program")
@AllArgsConstructor
@NoArgsConstructor

public class TourProgram {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name="programm_number", columnDefinition = "INTEGER")
    private int programmNumber;
    @Column(name = "description")
    private String description;
}
