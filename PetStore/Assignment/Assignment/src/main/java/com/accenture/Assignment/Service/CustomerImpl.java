package com.accenture.Assignment.Service;

import com.accenture.Assignment.Entity.Customer;
import com.accenture.Assignment.Entity.Pet;
import com.accenture.Assignment.Repository.CustomerRepo;
import com.accenture.Assignment.Repository.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerImpl implements CustomerService
{
    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    PetRepo petRepo;

    @Autowired
    PetService petService;
    @Override
    public ResponseEntity<?> getCustomerDetails(String Id) {
        Customer customer = customerRepo.findByCustId(Id);
        if(customer == null)
        {
            return ResponseEntity.ok("Customer does not exist");
        }
        else
            return ResponseEntity.ok(customer);
    }

    @Override
    public String addCustomer(Customer customer) {
        //Check if pet exist
        if(petService.checkExistence(customer.getPetId()))
        {
            if (petRepo.getBypetId(customer.getPetId()).getStatus().equalsIgnoreCase("Available")) {
                customerRepo.save(customer);
                Pet ownedPet = petRepo.getBypetId(customer.getPetId());
                ownedPet.setStatus("Locked");
                ownedPet.setOwner(customer.getCustName());
                petRepo.save(ownedPet);
                return "Added successfully\n\n" + customer.toString();
            } else {
                return "Pet with Id " + customer.getPetId() + " is not available";
            }

        }
        else
            return "Pet with Id " + customer.getPetId() + " doesn't exist";

    }

    @Override
    public Pet getPet(String Id) {
        int petId = customerRepo.findByCustId(Id).getPetId();
        return petRepo.getBypetId(petId);
    }

    @Override
    public List<Customer> getAllCustomer()
    {
        return customerRepo.findAll();
    }
}
