package com.accenture.Assignment.Entity;

import lombok.Data;
import com.accenture.Assignment.Entity.Pet;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Purchase")
@Data
public class Purchase {
    @Id
    @Column(name = "Purchase_Id")
    private String purchaseId;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "pet_Id", referencedColumnName = "pet_Id")
    private Pet pet;

    @Column(name = "date_purchase")
    private LocalDate purchaseDate;

    @Column(name = "price")
    private float price;
}
