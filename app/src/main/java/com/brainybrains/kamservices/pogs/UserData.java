package com.brainybrains.kamservices.pogs;

public class UserData {
    private String name, phone,address, houseNo, service;

    public UserData() {
    }

    public UserData(String name, String phone, String address, String houseNo, String service) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.houseNo = houseNo;
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
