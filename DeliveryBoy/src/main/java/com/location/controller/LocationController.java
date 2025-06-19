package com.location.controller;

import com.location.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/update-location")
public class LocationController {

    @Autowired
    LocationService locationService;
    @PostMapping
    public ResponseEntity<?> updateLocation()
    {
        for (int i = 1; i < 100000; i++) {
            System.out.println(            this.locationService.produceMessage("(" + Math.round(Math.random()+1) * 1000 + "," + Math.round(Math.random()+1) * 1000 + ")")
);
        }
        return new ResponseEntity<>(Map.of("message","location updated"), HttpStatus.OK);

    }
}
