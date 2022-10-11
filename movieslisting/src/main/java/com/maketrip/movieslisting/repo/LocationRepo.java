package com.maketrip.movieslisting.repo;

import com.maketrip.movieslisting.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface LocationRepo extends JpaRepository<Location,Long> {
    Optional<List<Location>> findByName(String Movies);
}
