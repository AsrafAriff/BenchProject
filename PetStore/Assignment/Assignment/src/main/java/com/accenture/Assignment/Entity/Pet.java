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
    @Column(name = "Pet_Id")
    private int petId;

    @Column(name = "Pet_type")
    private String petType;

    @Column(name = "Pet_name")
    private String petName;

    @Column(name = "Pet_Colour")
    private String petColour;

    @Column(name = "Status")
    private String status;

    @Column(name = "Owner")
    private String owner;
}
