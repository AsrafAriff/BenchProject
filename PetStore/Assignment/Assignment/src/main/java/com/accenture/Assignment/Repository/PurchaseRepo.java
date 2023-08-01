package com.accenture.Assignment.Repository;

import com.accenture.Assignment.Entity.Pet;
import com.accenture.Assignment.Entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepo  extends JpaRepository<Purchase,Integer>{

    Purchase getBypurchaseId (String Id);
}
