package com.example.touragency.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "staff")
@AllArgsConstructor
@NoArgsConstructor


public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "empl_passport_number")
    private long emplPassportNumber;
    @ManyToOne
    @Column(name = "position")
    private Post position;
    @Column(name = "full_employee_name")
    private String emplFullName;
    @Column(name ="employee_address")
    private String emplAddress;
}
