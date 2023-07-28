package com.accenture.Assignment.Service;

import com.accenture.Assignment.Entity.Pet;

import java.util.List;


public interface PetService
{
    String addPet(Pet pet);

    List<Pet> getAvailablePet(String availability);


    String updatePet (int Id, Pet pet);

    String deletePet (int Id);
}
