package com.example.touragency.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "events")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "city")
    private String city;
    // Место проведения мероприятия
    @Column(name = "place")
    private String place;
    @Column(name = "start_time", columnDefinition = "DATE")
    private Date startTime;
    @Column(name = "startDate", columnDefinition = "DATE")
    private Date startDate;
    @Column(name="tour_number", columnDefinition = "integer")
    //Счетный номер тура
    private long tourNumber;
    @Column(name = "event_name")
    private String eventName;
    @Column(name = "country")
    private String country;
    @Column(name = "tour_type")
    private String tourType;
    // Дата возвращения из тура
    @Column(name = "end_date", columnDefinition = "data")
    private Date endDate;
    @Column(name = "program_counter")
    private int programCounter;
}
