package com.accenture.Assignment.Service;

import com.accenture.Assignment.Entity.Pet;
import com.accenture.Assignment.Entity.Purchase;
import com.accenture.Assignment.Repository.PetRepo;
import com.accenture.Assignment.Repository.PurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PurchaseImpl implements PurchaseService{

    @Autowired
    PetRepo petRepo;
    @Autowired
    private PurchaseRepo purchaseRepo;

    @Override
    public String addPurchase (Purchase purchase)
    {

        Pet ownedPet = purchase.getPet();
        ownedPet.setAvailability("Not Available");
        purchase.setPurchaseDate(LocalDate.now());
        petRepo.save(ownedPet);
        purchaseRepo.save(purchase);
        return "added successfully";
    }

    @Override
    public ResponseEntity<?> getPurchaseDetails(String Id) {
        Purchase purchase = purchaseRepo.getBypurchaseId(Id);
        if(purchase == null)
        {
            return ResponseEntity.ok("Purchase does not exist");
        }
        else
            return ResponseEntity.ok(purchase);
    }

    @Override
    public List<Purchase> getAllPurchase()
    {
        return purchaseRepo.findAll();
    }

}
