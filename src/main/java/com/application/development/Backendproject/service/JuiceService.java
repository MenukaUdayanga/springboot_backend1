package com.application.development.Backendproject.service;

import com.application.development.Backendproject.Dao.JuiceDao;
import com.application.development.Backendproject.model.Juice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JuiceService {

    @Autowired
    private JuiceDao juiceDao;

    //findAllOrders

    public List<Juice> getAllJuices(){
        List<Juice> juices = this.juiceDao.findAll();

        return juices;
    }


    //saveOrders

    public Juice addJuice (Juice juice){
        Juice new1 = this.juiceDao.saveAndFlush(juice);
        return new1;
    }
}
