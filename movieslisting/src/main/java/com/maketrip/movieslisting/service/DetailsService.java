package com.maketrip.movieslisting.service;

import com.maketrip.movieslisting.model.Details;
import com.maketrip.movieslisting.repo.DetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DetailsService {

    private final DetailsRepo detailsRepo;

    @Autowired
    public DetailsService(DetailsRepo detailsRepo) {
        this.detailsRepo = detailsRepo;
    }

    public Details addDetails(Details details){
        return detailsRepo.save(details);
    }

    public Details updateDetails(Details details){
        return detailsRepo.save(details);
    }

    public List<Details> findAllDetails(){
        return detailsRepo.findAll();
    }

    public List<Details> findAllByOrderByLocationsAsc(){
        return detailsRepo.findAllByOrderByLocationsAsc();
    }

    public List<Details> findAllOrderBySort(String orderBy, String column){
        if(orderBy.equals("Asc") && column.equals("Location")){
            return detailsRepo.findAllByOrderByLocationsAsc();
        }
        else if(orderBy.equals("Desc") && column.equals("Location")){
            return detailsRepo.findAllByOrderByLocationsDesc();
        } else if (orderBy.equals("Asc") && column.equals("Name")) {
            return detailsRepo.findAllByOrderByNameAsc();
        }
        else {
            return detailsRepo.findAllByOrderByNameDesc();
        }

    }
}
