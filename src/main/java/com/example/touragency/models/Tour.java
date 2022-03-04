package com.example.touragency.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "tour_tasks")
@AllArgsConstructor
@NoArgsConstructor

public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "tour_number")
    private int tourNumber;
    @Column(name = "tour_type")
    private String tourType;
    @Column(name = "country")
    private String country;
    @Column(name = "start_date", columnDefinition = "data")
    private Date startDate;
    @Column(name = "end_date", columnDefinition = "data")
    private Date endDate;
    @Column(name="programm_number", columnDefinition = "INTEGER")
    private int programmNumber;
    // Краткая характеристика тура
    @Column(name = "tour_name")
    private String tour_name;
    @Column(name = "status")
    private String status;
}
