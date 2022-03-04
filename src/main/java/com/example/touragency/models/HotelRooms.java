package com.example.touragency.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="hotel_rooms")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelRooms {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "city")
    private String city;
    @Column(name = "hotel_name")
    private String hotelName;
    @Column(name = "check_in")
    private Date checkIn;
    @Column(name = "service_category")
    private String serviceCategory;
    @Column(name = "room_number")
    private int roomNumber;
    @Column(name = "check_out")
    private Date check_out;
}
