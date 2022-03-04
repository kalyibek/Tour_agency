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
    // place at the event
    private int place_number;
    @Column(name = "city")
    private String city;
    @Column(name = "startDate", columnDefinition = "DATE")
    private Date startDate;
    @Column(name = "event_place")
    // venue of the event
    private String eventPlace;
    @Column(name = "start_time", columnDefinition = "DATE")
    private Date startTime;



}
