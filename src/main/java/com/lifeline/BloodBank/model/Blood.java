package com.lifeline.BloodBank.model;

import jakarta.persistence.*;

@Entity
@Table(name="bloodbank")
public class Blood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "Name", nullable = false)
    private String Name;

    @Column(name = "Gender", nullable = false)
    private String Gender;

    @Column(name = "Age", nullable = false)
    private int Age;

    @Column(name = "BloodGroup", nullable = false)
    private String BloodGroup;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        BloodGroup = bloodGroup;
    }

    public Blood(int id, String name, String gender, int age, String bloodGroup) {
        Id = id;
        Name = name;
        Gender = gender;
        Age = age;
        BloodGroup = bloodGroup;
    }

    public Blood() {
    }



}
