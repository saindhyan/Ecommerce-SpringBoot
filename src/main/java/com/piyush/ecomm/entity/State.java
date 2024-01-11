package com.piyush.ecomm.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "state")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;

    @Column(name = "name")
    private String name;


    @ManyToOne
    @JoinColumn(name = "country_id",nullable = false)
    private Country country;
}
