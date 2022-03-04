package com.example.touragency.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hotel")
@Data@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="city", columnDefinition = "varchar(20)")
    private String city;
    @Column(name="name", columnDefinition = "varchar(20)")
    private String name;
    @Column(name="tour_number", columnDefinition = "INTEGER")
    private int tourNumber;
    @Column(name="class_of_comfort", columnDefinition = "varchar(20)")
    private String comfortClass;
    @Column(name="country", columnDefinition = "varchar(20)")
    private String country;
    @Column(name="tour_type", columnDefinition = "varchar(20)")
    private String tourType;
    @Column(name="start_date", columnDefinition = "DATE")
    private Date startDate;
    @Column(name="end_date", columnDefinition = "DATE")
    private Date endDate;
    @Column(name="programm_number", columnDefinition = "INTEGER")
    private int programmNumber;
}
