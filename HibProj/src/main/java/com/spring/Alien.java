package com.spring;

import jakarta.persistence.*;

import java.util.List;

@Entity
//@Table(name="alien_table")
public class Alien {

    @Id
    private int Aid;
    ///@Column(name="alien_name")
    private String Aname;
   // @Transient   //uses if you don't want this field to be add as column in table
    private String Tech;
//    @OneToOne
//    private Laptop laptop;
//    @OneToMany(mappedBy = "alien")
    @ManyToMany
    private List<Laptop> laptops;


    @Override
    public String toString() {
        return "Alien{" +
                "Aid=" + Aid +
                ", Aname='" + Aname + '\'' +
                ", Tech='" + Tech + '\'' +
                ", laptop=" + laptops +
                '}';
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public int getAid() {
        return Aid;
    }

    public void setAid(int aid) {
        Aid = aid;
    }

    public String getAname() {
        return Aname;
    }

    public void setAname(String aname) {
        Aname = aname;
    }

    public String getTech() {
        return Tech;
    }

    public void setTech(String tech) {
        Tech = tech;
    }
}
