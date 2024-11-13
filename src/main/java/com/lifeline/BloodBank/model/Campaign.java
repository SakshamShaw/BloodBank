package com.lifeline.BloodBank.model;


import jakarta.persistence.*;

@Entity
@Table(name = "campaign")
public class Campaign {
    @Id
    private int Campaign_Id;

    @Column(name = "C_Name", nullable = false)
    private String C_Name;

    @Column(name = "Date", nullable = false)
    private String Date;

    @Column(name = "loc", nullable = false)
    private String Location;

    public int getCampaign_Id() {
        return Campaign_Id;
    }

    public void setCampaign_Id(int Campaign_Id) {
        this.Campaign_Id = Campaign_Id;
    }

    public String getC_Name() {
        return C_Name;
    }

    public void setC_Name(String C_Name) {
        this.C_Name = C_Name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public Campaign(int Campaign_Id, String C_Name, String Date, String Location) {
        this.Campaign_Id = Campaign_Id;
        this.C_Name = C_Name;
        this.Date = Date;
        this.Location = Location;
    }

    public Campaign() {
    }
}
