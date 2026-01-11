package com.spring;

import jakarta.persistence.*;

import java.util.List;

//@Embeddable
@Entity
public class Laptop
{
    @Id
    private int Lid;
    private int Ram;
    private String model;
    private String Brand;
//    @ManyToOne
//    private Alien alien;
//    @ManyToMany(mappedBy = "laptops")
//    private List<Alien> aliens;


    @Override
    public String toString() {
        return "Laptop{" +
                "Brand='" + Brand + '\'' +
                ", Lid=" + Lid +
                ", Ram=" + Ram +
                ", model='" + model + '\'' +
                '}';
    }

//    public List<Alien> getAliens() {
//        return aliens;
//    }
//
//    public void setAliens(List<Alien> aliens) {
//        this.aliens = aliens;
//    }

    public int getLid() {
        return Lid;
    }

    public void setLid(int lid) {
        Lid = lid;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }
}
