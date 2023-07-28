package com.accenture.Assignment.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Pet")
@Data
public class Pet
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pet_Id")
    private int petId;


    @Column(name = "pet_name")
    private String petName;


    @Column(name = "availability")
    private String availability;

   @ManyToOne
   @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
   private Customer customer;

   @ManyToOne
   @JoinColumn(name = "inventory_id", referencedColumnName = "inventory_id")
   private Inventory inventory;
}
