package com.accenture.Assignment.Repository;

import com.accenture.Assignment.Entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InventoryRepo extends JpaRepository<Inventory,Integer> {

    Inventory getByInventoryId (int Id);

    @Query("SELECT p FROM Pet p WHERE p.status = :status")
    List<Inventory> getInventory (@Param("status") String status);
}
