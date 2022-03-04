package com.example.touragency.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tickets_vouchers")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class TourTickets {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "place_number")
    private int place_number;
    @Column(name = "city")
    private String city;
    @Column(name = "startDate", columnDefinition = "DATE")
    private Date startDate;
    @Column(name = "event_place")
    private String eventPlace;
    @Column(name = "start_time", columnDefinition = "DATE")
    private Date startTime;
    @Column(name="client_name", columnDefinition = "varchar(55)" )
    private String clientName;
    @Column(name="address", columnDefinition = "varchar(55)")
    private String address;
    @Column(name="tour_number", columnDefinition = "integer")
    //Счетный номер тура
    private long tourNumber;
    @Column(name="registration_date", columnDefinition = "date")
    private Date registrationDate;
}
