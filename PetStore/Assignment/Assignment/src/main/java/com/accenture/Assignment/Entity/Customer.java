package com.accenture.Assignment.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
@Data
public class Customer
{
    @Id
    @Column(name = "customer_Id")
    private String custId;

    @Column(name = "customer_Name")
    private String custName;

    @Column(name = "pet_Id")
    private int petId;
}
