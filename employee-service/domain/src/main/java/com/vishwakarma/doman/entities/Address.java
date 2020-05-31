package com.vishwakarma.doman.entities;

public class Address {
    private int houseNumber;
    private String streetRoad;
    private String city;
    private long pinCode;

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetRoad() {
        return streetRoad;
    }

    public void setStreetRoad(String streetRoad) {
        this.streetRoad = streetRoad;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }
}
