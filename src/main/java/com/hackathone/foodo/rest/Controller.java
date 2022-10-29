package com.hackathone.foodo.rest;


import com.hackathone.foodo.dto.AddHotelDto;
import com.hackathone.foodo.service.AddHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/hotels")
public class Controller {

    @Autowired
    private AddHotelService addHotelService;

    @PostMapping(value = "/addHotel")
    public String addHotel(@RequestBody AddHotelDto addHotelDto){

        return addHotelService.addHotel(addHotelDto);

    }
}
