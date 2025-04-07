package com.zomata.app4;

public class Restaurant {
    private String name;
    private String location;

    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getDetails() {
        return name + " located at " + location;
    }
}
