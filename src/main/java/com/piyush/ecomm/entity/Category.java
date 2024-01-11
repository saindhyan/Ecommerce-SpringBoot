package com.piyush.ecomm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "product_category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
     private Long id;

    @Column(name ="category_name" )
    private String name;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
    private List<Product> products;
}
