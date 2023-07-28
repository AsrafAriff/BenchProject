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
    @Column(name = "customer_id")
    private String custId;

    @Column(name = "customer_name")
    private String custName;
}
