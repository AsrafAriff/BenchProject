package com.accenture.Assignment.Service;

import com.accenture.Assignment.Entity.Customer;
import com.accenture.Assignment.Entity.Pet;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CustomerService
{
    ResponseEntity<?> getCustomerDetails (String Id);

    String addCustomer (Customer customer);
    List<Customer> getAllCustomer();

}
