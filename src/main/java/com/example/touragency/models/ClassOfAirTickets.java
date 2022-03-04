package com.example.touragency.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "air_tickets_class")
@AllArgsConstructor
@NoArgsConstructor
@Data
//Класс обслуживания в самолете
public class ClassOfAirTickets {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private int id;
    @Column(name = "service_class")
    private String serviceClass;
}
