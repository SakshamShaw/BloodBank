package com.lifeline.BloodBank.Repository;

import com.lifeline.BloodBank.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepo extends JpaRepository<Campaign,Long> {
}
