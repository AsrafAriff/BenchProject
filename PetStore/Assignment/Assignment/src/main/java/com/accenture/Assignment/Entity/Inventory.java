package com.accenture.Assignment.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Inventory")
@Data
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Inventory_Id")
    private int inventoryId;

    @Column(name = "Pet_type")
    private String petType;

    @Column(name = "Pet_Breed")
    private String petBreed;

    @Column(name = "Quantity")
    private String quantity;



}
