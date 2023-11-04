package com.bongo.meterialdesign_prectices.Model;

public class HomeItems {
    private String listName;
    private int listImage;

    public HomeItems(String listName, int listImage) {
        this.listName = listName;
        this.listImage = listImage;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public int getListImage() {
        return listImage;
    }

    public void setListImage(int listImage) {
        this.listImage = listImage;
    }
}
