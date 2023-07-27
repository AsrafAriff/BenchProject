package com.accenture.Assignment.Entity;

import com.accenture.Assignment.Entity.Customer;
import com.accenture.Assignment.Entity.Inventory;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "pet")
@Data
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_id")
    private int petId;

    @Column(name = "pet_name", length = 100)
    private String petName;

    @Column(name = "availability")
    private boolean availability;

    // Define the many-to-one relationship with the Customer entity
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customer;

    // Define the many-to-one relationship with the Inventory entity
    @ManyToOne
    @JoinColumn(name = "inventory_id", referencedColumnName = "inventory_id")
    private Inventory inventory;

}
