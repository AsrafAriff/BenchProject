package com.accenture.Assignment.Service;

import com.accenture.Assignment.Entity.Inventory;
import com.accenture.Assignment.Repository.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InventoryServiceImpl implements InventoryService{

    @Autowired
    InventoryRepo inventoryRepo;

    @Override
    public String addInventory(Inventory inventory) {
        inventoryRepo.save(inventory);
        return "added successfully";
    }

    @Override
    public String updateInventory(int Id, Inventory inventory) {
        Inventory updatedInventory = inventoryRepo.getByInventoryId(Id);
        updatedInventory.setPetType(inventory.getPetType());
        updatedInventory.setPetBreed(inventory.getPetBreed());
        updatedInventory.setQuantity(inventory.getQuantity());
        return "updated successfully";
    }

    @Override
    public String deleteInventory(int Id) {
        inventoryRepo.deleteById(Id);
        return "successfully deleted";
    }

    @Override
    public List<Inventory> getAllInventory() {
        return inventoryRepo.findAll();
    }
}
