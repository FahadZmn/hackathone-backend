package com.hackathone.foodo.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Hotel_Details")
public class HotelDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String location;
    private String type;
    private String emailId;
    private int review;
    private Float rating;
    private Boolean parkingLot;
    private String status;
    private String time;
    private String restaurantType;
    private String caption;
    private Long phone;
    private String averageCost;
    private String cuisines;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "hotel_menu",
            joinColumns = {
                    @JoinColumn(name = "hotelId", referencedColumnName = "id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "menuId", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    private List<Menu> menu;

}
