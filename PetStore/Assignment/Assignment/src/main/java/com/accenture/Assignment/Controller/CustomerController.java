package com.accenture.Assignment.Controller;
import com.accenture.Assignment.Entity.Customer;
import com.accenture.Assignment.Entity.Pet;
import com.accenture.Assignment.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer/")
public class CustomerController
{
    @Autowired
    CustomerService customerService;
    @GetMapping("get-customer/{custId}")
    public ResponseEntity<?> getCustomerDetails (@PathVariable(value = "custId")String Id)
    {
        return customerService.getCustomerDetails(Id);
    }
    @GetMapping ("get-all-customer")
    public List<Customer> getCustomerDetails()
    {
        return customerService.getAllCustomer();
    }

    @PostMapping("add-customer")
    public String addCustomer (@RequestBody Customer customer)
    {
        return customerService.addCustomer(customer);
    }
}
