package com.example.touragency.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tour_flight")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TourFlights {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "flight_code")
    private int flightCode;
    @Column(name = "airline")
    private String airline;
    @Column(name = "tour_number")
    private int tourNumber;
    @Column(name = "departure_date")
    private Date departureDate;
    @Column(name = "departure_time")
    private Date departureTime;
    @Column(name = "city_of_arrival")
    private String cityOfArrival;
    @Column(name = "departure_city")
    private String departureCity;
    @Column(name = "country")
    private String country;
    @Column(name = "tour_type")
    private String tourType;
    // Начало и конец поездки по туру
    @Column(name = "start_date", columnDefinition = "data")
    private Date startDate;
    @Column(name = "end_date", columnDefinition = "data")
    private Date endDate;
    @Column(name="program_number", columnDefinition = "INTEGER")
    private int programNumber;


}
