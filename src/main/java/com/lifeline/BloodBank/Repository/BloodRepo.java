package com.lifeline.BloodBank.Repository;

import com.lifeline.BloodBank.model.Blood;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BloodRepo extends JpaRepository<Blood, Integer> {

}
