package com.maketrip.movieslisting.controller;

import com.maketrip.movieslisting.model.Details;
import com.maketrip.movieslisting.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moviesDetails")
public class MovieController {

    private final DetailsService detailsService;

    @Autowired
    public MovieController(DetailsService detailsService) {
        this.detailsService = detailsService;
    }

    @GetMapping("/allDetails")
    public ResponseEntity<List<Details>> getAllMoviesDetails(){
        List<Details> details= detailsService.findAllDetails();
        return new ResponseEntity<>(details, HttpStatus.OK);
    }

    @PostMapping("/addDetails")
    public  ResponseEntity<Details> addDetails(@RequestBody Details details){
        Details newDetails = detailsService.addDetails(details);
        return  new ResponseEntity<>(newDetails,HttpStatus.OK);
    }

}
