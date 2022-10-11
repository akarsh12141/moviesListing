package com.maketrip.movieslisting.controller;


import com.maketrip.movieslisting.model.Location;
import com.maketrip.movieslisting.service.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moviesLocation")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/allLocation")
    public ResponseEntity<List<Location>> getAllMoviesLocation(){
        List<Location> allLocation= locationService.findAllLocation();
        return new ResponseEntity<>(allLocation, HttpStatus.OK);
    }

    @PostMapping("/addLocation")
    public  ResponseEntity<Location> addLocation(@RequestBody Location location){
        Location newLocation = locationService.addLoaction(location);
        return  new ResponseEntity<>(newLocation,HttpStatus.OK);
    }

    @GetMapping("/LoactionName/{name}")
    public  ResponseEntity<List<Location>> findLocationByName(@PathVariable("name") String name){
        List<Location> location = locationService.findByName(name);
        return new ResponseEntity<>(location,HttpStatus.OK);
    }
}
