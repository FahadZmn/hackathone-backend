package com.hackathone.foodo.dto;

import com.hackathone.foodo.entity.Menu;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AddHotelDto {

    private String name;
    private String location;
    private String type;
    private String emailId;
    private int review;
    private Boolean parkingLot;
    private String status;
    private String time;
    private String restaurantType;
    private String caption;
    private Long phone;
    private String averageCost;
    private String cuisines;
    private Float rating;
    private List<Menu> menus;
}
