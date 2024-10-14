package com.example.demo.domain.tableperclass;

import jakarta.persistence.Entity;

@Entity
public class Dog extends Mammal {
    private String adres;

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
