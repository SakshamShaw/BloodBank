package com.lifeline.BloodBank;

import com.lifeline.BloodBank.Repository.BloodRepo;
import com.lifeline.BloodBank.Repository.CampaignRepo;
import com.lifeline.BloodBank.Repository.LogAdminRepo;
import com.lifeline.BloodBank.model.Blood;
import com.lifeline.BloodBank.model.Campaign;
import com.lifeline.BloodBank.model.LogAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BloodBankApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BloodBankApplication.class, args);
	}

	@Autowired
	private BloodRepo bloodRepo;
	@Autowired
	private LogAdminRepo logAdminRepo;

	@Autowired
	private CampaignRepo campaignRepo;

	@Override
	public void run(String... args) throws Exception
	{
		Blood u1=new Blood();
		LogAdmin a1=new LogAdmin();
		Campaign c1= new Campaign();

	}
}
