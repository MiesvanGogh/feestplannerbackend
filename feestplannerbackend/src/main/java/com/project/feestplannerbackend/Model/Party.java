package com.project.feestplannerbackend.Model;


import org.springframework.ui.Model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;


@Entity
public class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String Partyname;
    private String Description;
    private LocalDate Date;
    private LocalTime Starttime;
    private LocalTime Endtime;

    @OneToMany(targetEntity = User.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "User_fk", referencedColumnName = "ID")
    private List<User> members;

    public Party(){
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPartyname() {
        return Partyname;
    }

    public void setPartyname(String partyname) {
        Partyname = partyname;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public LocalTime getStartTime() {
        return Starttime;
    }

    public void setStartTime(LocalTime startTime) {
        Starttime = startTime;
    }

    public LocalTime getEndTime() {
        return Endtime;
    }

    public void setEndTime(LocalTime endtime) {
        Endtime = endtime;
    }
}
