package com.accenture.Assignment.Service;

import com.accenture.Assignment.Entity.Inventory;

import java.util.List;
public interface InventoryService {

    String addInventory (Inventory inventory);

    String updateInventory (int Id, Inventory inventory);

    String deleteInventory (int Id);

    List<Inventory> getAllInventory();
}
