package com.accenture.Assignment.Repository;

import com.accenture.Assignment.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerRepo extends JpaRepository<Customer, Integer>
{
    Customer findByCustId (String Id);
}
