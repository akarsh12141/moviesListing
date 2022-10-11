package com.maketrip.movieslisting.repo;

import com.maketrip.movieslisting.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepo extends JpaRepository<Details,Long> {
}
