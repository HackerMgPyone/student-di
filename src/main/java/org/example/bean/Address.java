package org.example.bean;


import org.springframework.stereotype.Component;

@Component
public class Address {
    private String city = "Kenn City";

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
