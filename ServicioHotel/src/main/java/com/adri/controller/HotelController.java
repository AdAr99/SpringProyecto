package com.adri.controller;

import com.adri.model.Hotel;
import com.adri.service.HotelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {

    @Autowired
    HotelServices service;

    @GetMapping(value = "hotel", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hotel> listar(){
        return  service.lista();
    }

    @GetMapping(value = "hotel/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Hotel buscar(@PathVariable String nombre){
        return service.buscar(nombre);
    }
}
