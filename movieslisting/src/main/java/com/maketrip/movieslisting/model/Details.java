package com.maketrip.movieslisting.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Details implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String name;
    private String  actor;
    private String language;
    private String genre;
    private String locations ;

    public Details(){}

    public Details(String name, String actor , String language ,String genre, String location){
        this.name=name;
        this.actor=actor;
        this.language=language;
        this.genre=genre;
        this.locations=location;
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

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", actor='" + actor + '\'' +
                ", language='" + language + '\'' +
                ", genre='" + genre + '\'' +
                ", locations='" + locations + '\'' +
                '}';
    }
}
