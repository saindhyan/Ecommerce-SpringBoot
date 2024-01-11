package com.piyush.ecomm.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "code")
    private  String code;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "country",cascade = CascadeType.ALL)
    private List<State> states;
}
