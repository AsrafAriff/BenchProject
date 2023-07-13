package com.accenture.Assignment.Repository;

import com.accenture.Assignment.Entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepo extends JpaRepository<Pet,Integer>
{
    Pet getBypetId (int Id);

    @Query ("SELECT p FROM Pet p WHERE p.status = :status")
    List<Pet> getAvailablePets (@Param("status") String status);
}
