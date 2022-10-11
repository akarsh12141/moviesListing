package com.maketrip.movieslisting.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Location implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String name;
    private String theatre;
    private String timings;
    private String location;
    private Long price;

    public  Location(){}

    public Location(String name, String theatre, String timings, String location, Long price){
        this.name=name;
        this.theatre=theatre;
        this.timings=timings;
        this.location=location;
        this.price=price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheatre() {
        return theatre;
    }

    public void setTheatre(String theatre) {
        this.theatre = theatre;
    }

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theatre='" + theatre + '\'' +
                ", timings='" + timings + '\'' +
                ", location='" + location + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
