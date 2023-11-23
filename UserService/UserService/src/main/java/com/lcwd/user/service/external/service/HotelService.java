package com.lcwd.user.service.external.service;

import com.lcwd.user.service.entities.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="HOTEL-SERVICES")
public interface HotelService {

    @GetMapping("/Hotels/{hotelId}")
     Hotel getHotel(@PathVariable("hotelId") String hotelId);
}
