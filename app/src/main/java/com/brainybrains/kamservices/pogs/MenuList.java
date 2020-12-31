package com.brainybrains.kamservices.pogs;

import com.brainybrains.kamservices.R;

import java.util.ArrayList;

public class MenuList {
    private String titel, firstDitels,secondDitels,thiredDitels,price;
    private int image;

    public MenuList() {
    }

    public MenuList(String titel, String firstDitels, String secondDitels, String thiredDitels, String price, int image) {
        this.titel = titel;
        this.firstDitels = firstDitels;
        this.secondDitels = secondDitels;
        this.thiredDitels = thiredDitels;
        this.price = price;
        this.image = image;
    }


    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getFirstDitels() {
        return firstDitels;
    }

    public void setFirstDitels(String firstDitels) {
        this.firstDitels = firstDitels;
    }

    public String getSecondDitels() {
        return secondDitels;
    }

    public void setSecondDitels(String secondDitels) {
        this.secondDitels = secondDitels;
    }

    public String getThiredDitels() {
        return thiredDitels;
    }

    public void setThiredDitels(String thiredDitels) {
        this.thiredDitels = thiredDitels;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }



    public ArrayList<MenuList> getItems() {
        ArrayList<MenuList> arrayList = new ArrayList<>();
        arrayList.add(new MenuList("Kids Hair cut", "For 3- 14 Yrs", "Stylist trained to cut hair for boys & Girls", "", "250", R.drawable.two));
        arrayList.add(new MenuList("Father and child Haircut", "For Father and Child", "Stylist trained to cut hair for boys & Girls", "", "450", R.drawable.two));
        return arrayList;
    }
}
