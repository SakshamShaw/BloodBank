package com.lifeline.BloodBank.Controller;


import com.lifeline.BloodBank.Repository.BloodRepo;
import com.lifeline.BloodBank.Repository.LogAdminRepo;
import com.lifeline.BloodBank.model.Blood;
import com.lifeline.BloodBank.model.LogAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/blood/api")
public class BloodController {
    @Autowired
    private BloodRepo bloodRepo;
    private LogAdminRepo logAdminRepo;

    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @GetMapping("/getAll")
    List<Blood> getAllUsers() {
        return bloodRepo.findAll();
    }

    @PostMapping("/addBlood")
    public ResponseEntity<Object> addUser(@RequestBody Blood U) {
        HashMap<String, String> map = new HashMap<>();
        try {
            bloodRepo.save(U);
            map.put("status", "true");
            map.put("message", "Blood Added Successfully...");
            return new ResponseEntity<>(map, HttpStatus.OK);
        } catch (Exception e) {
            map.put("status", "false");
            map.put("message", "Internal Server Error");
            return new ResponseEntity<>(map, HttpStatus.OK);
        }
    }

    @GetMapping("/getBlood/{bloodGroup}")
    public List<Blood> getBlood(@PathVariable String bloodGroup) {
        List<Blood> all = bloodRepo.findAll();
        ArrayList<Blood> temp = new ArrayList<>();
        for (Blood blood : all) {
            if (blood.getBloodGroup().equalsIgnoreCase(bloodGroup)) {
                temp.add(blood);
            }
        }
        return temp;
    }
}
