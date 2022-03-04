package com.example.touragency.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "tour_tasks")
@AllArgsConstructor
@NoArgsConstructor

public class TourTasks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "task_number")
    private int taskNumber;
    @Column(name = "empl_passport_number")
    private long emplPassportNumber;
    @Column(name = "tour_number")
    private int tourNumber;
    @Column(name = "country")
    private String country;
    @Column(name = "tour_type")
    private String tourType;
    @Column(name = "start_date", columnDefinition = "data")
    private Date startDate;
    @Column(name = "end_date", columnDefinition = "data")
    private Date endDate;
    @Column(name = "definition")
    private String definition;
    @Column(name = "executing_time", columnDefinition = "data")
    private Date executingTime;
    @Column(name = "status")
    private String status;
    @Column(name="programm_number", columnDefinition = "INTEGER")
    private int programmNumber;

}
