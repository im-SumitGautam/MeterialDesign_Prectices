package com.bongo.meterialdesign_prectices.Model;

import java.util.Date;

public class IncomeEntity {

    private int amount;
    private Date date;

    private String category;

    private  String note;

    public IncomeEntity(int amount, Date date, String category, String note) {
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.note = note;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
