package com.lifeline.BloodBank.Controller;

import com.lifeline.BloodBank.Repository.LogAdminRepo;
import com.lifeline.BloodBank.model.LogAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/blood/api")
public class LopAdminController {
        @Autowired
        private LogAdminRepo logAdminRepo;

        @GetMapping("/admin")
        public List<LogAdmin> getAllAdmins() {
            return logAdminRepo.findAll();
        }
    }

