package com.maketrip.movieslisting.repo;

import com.maketrip.movieslisting.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetailsRepo extends JpaRepository<Details,Long> {
    List<Details> findAllByOrderByLocationsAsc();
    List<Details> findAllByOrderByLocationsDesc();

    List<Details> findAllByOrderByNameAsc();

    List<Details> findAllByOrderByNameDesc();
}
