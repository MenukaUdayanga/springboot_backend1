package com.application.development.Backendproject.service;

import com.application.development.Backendproject.model.Juice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JuiceServiceTest {

    @Autowired
    private JuiceService juiceService;

    @Test
    void getAllFruits() {
        this.juiceService.getAllJuices();
    }

    @Test
    void addJuice() {

        Juice juice = new Juice();
        juice.setNumber(6);
       juice.setJuiceName("Apple");
       juice.setGlassOfJuice(2);
       juice.setPrice(500);
       juice.setDate("1");
       juice.setTime("5");


        juiceService.addJuice(juice);

    }
}
