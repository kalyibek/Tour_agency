package com.example.touragency.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "event_tickets")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class EventTickets {

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



}
