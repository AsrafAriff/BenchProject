package com.accenture.Assignment.Service;

import com.accenture.Assignment.Entity.Customer;

import com.accenture.Assignment.Repository.CustomerRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerImpl implements CustomerService
{
    @Autowired
    CustomerRepo customerRepo;

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
        customerRepo.save(customer);
        return "added successfully";
    }


    @Override
    public List<Customer> getAllCustomer()
    {
        return customerRepo.findAll();
    }
}
