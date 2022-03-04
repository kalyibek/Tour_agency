package com.example.touragency.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "order")
@AllArgsConstructor
@NoArgsConstructor

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    // Счетный номер тура
    @Column(name = "tour_number")
    private int tourNumber;
    @Column(name = "empl_passport_number")
    private long emplPassportNumber;
    @Column(name="country", columnDefinition = "varchar(20)")
    private String country;
    @Column(name = "tour_type")
    private String tourType;
    // Дата начала поездки по туру
    @Column(name = "start_date", columnDefinition = "data")
    private Date startDate;
    @Column(name = "end_date", columnDefinition = "data")
    private Date endDate;
    @Column(name="programm_number", columnDefinition = "INTEGER")
    private int programmNumber;
    @Column(name = "order_number")
    private int orderNumber;
}
