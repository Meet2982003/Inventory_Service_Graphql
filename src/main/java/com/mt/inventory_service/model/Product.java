package com.mt.inventory_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String category;
    private Float Price;
    private Integer stock;

    public Product(String name, String category, Float price, Integer stock) {
        this.name = name;
        this.category = category;
        Price = price;
        this.stock = stock;
    }

}
