package com.hackathone.foodo.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class GetHotelDto {

    private String place;
    private String type;
    private String status;
    private String restaurantType;
}
