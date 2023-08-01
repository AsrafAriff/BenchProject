package com.accenture.Assignment.Service;

import com.accenture.Assignment.Entity.Purchase;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PurchaseService {

    String addPurchase(Purchase purchase);

    ResponseEntity<?> getPurchaseDetails (String Id);

    List<Purchase> getAllPurchase();

}
