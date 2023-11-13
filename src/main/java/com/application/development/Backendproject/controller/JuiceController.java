package com.application.development.Backendproject.controller;

import com.application.development.Backendproject.model.Juice;
import com.application.development.Backendproject.service.JuiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/juice")

public class JuiceController {

    @Autowired
    private JuiceService juiceService;

    @RequestMapping(value = "/getAllJuices",method = RequestMethod.GET)
    ResponseEntity < List<Juice>>getAllJuices(){
        List<Juice> juices = this.juiceService.getAllJuices();

        return new ResponseEntity<>(juices, HttpStatus.OK);
    }

    @RequestMapping(value = "/addJuice",method = RequestMethod.POST)
    public ResponseEntity<Juice>addJuice(@RequestBody Juice juice){
        Juice new1 = this.juiceService.addJuice(juice);

        return new ResponseEntity<>(new1,HttpStatus.CREATED);
    }


}
