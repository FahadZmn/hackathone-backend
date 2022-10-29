package com.hackathone.foodo.service;

import com.hackathone.foodo.dto.AddHotelDto;
import com.hackathone.foodo.entity.HotelDetails;
import com.hackathone.foodo.repository.HotelDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddHotelService {

    @Autowired
    private HotelDetailsRepository hotelDetailsRepository;

    public String addHotel(AddHotelDto addHotelDto){

        HotelDetails details=HotelDetails.builder().caption(addHotelDto.getCaption()).menu(addHotelDto.getMenus())
                        .name(addHotelDto.getName()).phone(addHotelDto.getPhone()).averageCost(addHotelDto.getAverageCost())
                        .time(addHotelDto.getTime()).type(addHotelDto.getType()).emailId(addHotelDto.getEmailId())
                        .cuisines(addHotelDto.getCuisines()).location(addHotelDto.getLocation()).status(addHotelDto.getStatus())
                        .caption(addHotelDto.getCaption()).parkingLot(addHotelDto.getParkingLot()).restaurantType(addHotelDto.getRestaurantType())
                        .review(addHotelDto.getReview()).rating(addHotelDto.getRating()).build();

        hotelDetailsRepository.save(details);
        return "Hotel Added";

    }
}
