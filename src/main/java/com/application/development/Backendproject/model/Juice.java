package com.application.development.Backendproject.model;

import javax.persistence.*;

@Entity
@Table(name = "t_juice")
public class Juice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NUMBER",updatable = false,nullable = false)
    private  Integer number;

    @Column(name = "JUICE_NAME")
    private String juiceName;

    @Column(name = "GLASS_OF_JUICE")
    private Integer glassOfJuice;

    @Column(name = "PRICE")
    private Integer price;

    @Column(name = "DATE")
    private String date;

    @Column(name = "TIME")
    private String time;

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
