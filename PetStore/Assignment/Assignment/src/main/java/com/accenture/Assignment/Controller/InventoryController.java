package com.accenture.Assignment.Controller;
import com.accenture.Assignment.Entity.Inventory;
import com.accenture.Assignment.Service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/inventory/")
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @PostMapping("add-inventory")
    public String addInventory (@RequestBody Inventory inventory)
    {
        return inventoryService.addInventory(inventory);
    }

    @PutMapping("update-inventory/{inventoryId}")
    public String updatePet (@PathVariable int inventoryId,@RequestBody Inventory inventory)
    {
        return inventoryService.updateInventory(inventoryId, inventory);
    }


    @DeleteMapping("delete-inventory/{inventoryId}")
    public String deleteInventory (@PathVariable int inventoryId)
    {
        return inventoryService.deleteInventory(inventoryId);
    }

    @GetMapping ("get-all-inventory")
    public List<Inventory> getAllInventory()
    {
        return inventoryService.getAllInventory();
    }




}
