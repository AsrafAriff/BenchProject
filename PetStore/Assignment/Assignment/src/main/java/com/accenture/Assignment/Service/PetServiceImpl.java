package com.accenture.Assignment.Service;

import com.accenture.Assignment.Entity.Pet;
import com.accenture.Assignment.Repository.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetService{

    @Autowired
    PetRepo petRepo;
    @Override
    public String addPet(Pet pet) {
        petRepo.save(pet);
        return "Added Successfully\n\n" + pet.toString();
    }

    @Override
    public List<Pet> getAvailablePet(String availability) {
        return petRepo.getAvailablePets(availability);
    }


    @Override
    public String updatePet(int Id, Pet pet) {
        Pet updatedPet = petRepo.getBypetId(Id);
        updatedPet.setPetName(pet.getPetName());
        petRepo.save(updatedPet);
        return "Successfully update pet info\n\n"  + updatedPet.toString();
    }

    @Override
    public String deletePet(int Id) {
        petRepo.deleteById(Id);
        return "Pet successfully delete \n\n";
    }
}
