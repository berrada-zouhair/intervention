package com.intervention.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "intervention")
public class Intervention {

    public Intervention() {
    }

    public Intervention(String name, String city, String description) {
        this.name = name;
        this.city = city;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    private String city;

    private String description;
}
