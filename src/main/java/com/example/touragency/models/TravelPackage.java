package com.example.touragency.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "tour")
@AllArgsConstructor
@NoArgsConstructor
public class TravelPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "passport_number")
    private long passportNumber;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "address")
    private String address;
    // Счетный номер тура
    @Column(name = "tour_number")
    private int tourNumber;
    @Column(name="registration_date", columnDefinition = "date")
    private Date registrationDate;
    // Счетный номер путевки
    @Column(name = "travel_package_number")
    private int travelPackageNumber;




}

