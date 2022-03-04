package com.example.touragency.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="contract")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name="client_name", columnDefinition = "varchar(55)" )
    private String clientName;
    @Column(name="address", columnDefinition = "varchar(55)")
    private String address;
    @Column(name="tour_number", columnDefinition = "integer")
    //Счетный номер тура
    private long tourNumber;
    @Column(name="registration_date", columnDefinition = "date")
    private Date registrationDate;
    @Column(name="contract_number", columnDefinition = "integer")
    private long contractNumber;
    @Column(name="country", columnDefinition = "varchar(55)" )
    private String country;
    @Column(name="tour_type", columnDefinition = "varchar(55)" )
    private String tourType;

}
