package com.accenture.Assignment.Controller;
import com.accenture.Assignment.Entity.Customer;
import com.accenture.Assignment.Entity.Purchase;
import com.accenture.Assignment.Service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/purchase/")
public class PurchaseController {

    @Autowired
    PurchaseService purchaseService;
    @GetMapping("get-purchase/{purchaseId}")
    public ResponseEntity<?> getPurchaseDetails (@PathVariable(value = "purchaseId")String Id)
    {
        return purchaseService.getPurchaseDetails(Id);
    }

    @GetMapping ("get-all-purchase")
    public List<Purchase> getPurchaseDetailsDetails()
    {
        return purchaseService.getAllPurchase();
    }

    @PostMapping("add-purchase")
    public String addPurchase (@RequestBody Purchase purchase)
    {

        return purchaseService.addPurchase(purchase);
    }
}
