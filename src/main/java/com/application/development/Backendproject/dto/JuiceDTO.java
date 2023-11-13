package com.application.development.Backendproject.dto;

import com.application.development.Backendproject.model.Juice;

public class JuiceDTO  {

    private  Integer number;


    private String juiceName;


    private Integer glassOfJuice;


    private Integer price;


    private String date;


    private String time;

    public JuiceDTO() {
    }

    public JuiceDTO(Juice juice) {
        this.number = juice.getNumber();
        this.juiceName = juice.getJuiceName();
        this.glassOfJuice = juice.getGlassOfJuice();
        this.price = juice.getPrice();
        date = juice.getDate();
        this.time = juice.getTime();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getJuiceName() {
        return juiceName;
    }

    public void setJuiceName(String juiceName) {
        this.juiceName = juiceName;
    }

    public Integer getGlassOfJuice() {
        return glassOfJuice;
    }

    public void setGlassOfJuice(Integer glassOfJuice) {
        this.glassOfJuice = glassOfJuice;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
