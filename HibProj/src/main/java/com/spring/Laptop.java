package com.spring;

import jakarta.persistence.Embeddable;

@Embeddable
public class Laptop
{
    private int Ram;
    private String model;
    private String Brand;

    @Override
    public String toString() {
        return "Laptop{" +
                "Brand='" + Brand + '\'' +
                ", Ram=" + Ram +
                ", model='" + model + '\'' +
                '}';
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
