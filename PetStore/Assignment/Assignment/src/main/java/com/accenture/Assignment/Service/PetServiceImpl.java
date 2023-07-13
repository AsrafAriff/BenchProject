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
        pet.setStatus("Available");
        petRepo.save(pet);
        return "Added Successfully\n\n" + pet.toString();
    }

    @Override
    public List<Pet> getAvailablePet(String status) {
        return petRepo.getAvailablePets(status);
    }

    @Override
    public Boolean checkExistence(int Id) {
        return true;
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
