package com.lifeline.BloodBank.Controller;


import com.lifeline.BloodBank.Repository.CampaignRepo;
import com.lifeline.BloodBank.model.Campaign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/blood/api")
public class CampaignController {

    @Autowired
    private CampaignRepo campaignRepo;

    @GetMapping("/admin/all")
    List<Campaign> getAllUsers() {
        return campaignRepo.findAll();
    }

    @PostMapping("/addCamp")
    public ResponseEntity<Object> addCamp(@RequestBody Campaign U) {
        HashMap<String, String> map = new HashMap<>();
        try {
            campaignRepo.save(U);
            map.put("status", "true");
            map.put("message", "Blood Added Successfully...");
            return new ResponseEntity<>(map, HttpStatus.OK);
        } catch (Exception e) {
            map.put("status", "false");
            map.put("message", "Internal Server Error");
            return new ResponseEntity<>(map, HttpStatus.OK);
        }
    }
}
