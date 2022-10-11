package com.maketrip.movieslisting.service;

import com.maketrip.movieslisting.Exception.LoactionNotFound;
import com.maketrip.movieslisting.model.Location;
import com.maketrip.movieslisting.repo.LocationRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class LocationService {

    private  final LocationRepo locationRepo;


    public LocationService(LocationRepo locationRepo) {
        this.locationRepo = locationRepo;
    }

    public Location addLoaction(Location location){
        return locationRepo.save(location);
    }

    public Location updateLocation(Location location){
        return locationRepo.save(location);
    }

    public List<Location> findAllLocation(){
        return  locationRepo.findAll();
    }
    public  List<Location> findByName(String MoviesName){
        return locationRepo.findByName(MoviesName).orElseThrow(()->new LoactionNotFound("Location for "+ MoviesName+"  was not found"));
    }
}
