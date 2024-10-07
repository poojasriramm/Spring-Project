package com.commerce.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int price;
    private String name;
    private String description;
    private Date releaseDate;
    private boolean available;
    private int stockQuantity;
    private String brand;
    private String category;
    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageDate;
}