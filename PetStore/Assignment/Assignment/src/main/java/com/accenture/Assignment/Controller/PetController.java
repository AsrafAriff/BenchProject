package com.accenture.Assignment.Controller;

import com.accenture.Assignment.Entity.Pet;
import com.accenture.Assignment.Service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/pet")
public class PetController
{
    @Autowired
    PetService petService;

    @PostMapping("add")
    public String addPet (@RequestBody Pet pet)
    {
        return petService.addPet(pet);
    }

    @GetMapping("get-status/{status}")
    public List<Pet> getAvailablePet (@PathVariable String availability)
    {
        return petService.getAvailablePet(availability);
    }

    @PutMapping("update-pet/{petId}")
    public String updatePet (@PathVariable int petId,@RequestBody Pet pet)
    {
        return petService.updatePet(petId,pet);
    }

    @DeleteMapping("delete-pet/{petId}")
    public String deletePet (@PathVariable int petId)
    {
        return petService.deletePet(petId);
    }
}
