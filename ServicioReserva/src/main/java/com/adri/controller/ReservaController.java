package com.adri.controller;

import com.adri.model.Reserva;
import com.adri.service.ReservaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservaController {
    @Autowired
    ReservaServices services;

    @PostMapping(value = "reserva/{plazaslibres}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void registrar(@RequestBody Reserva rv, @PathVariable int plazaslibres){
        services.registrar(rv, plazaslibres);
    }

    @GetMapping(value = "reserva/{nombrehotel}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Reserva> lista(@PathVariable String nombrehotel){
        return services.lista(nombrehotel);
    }
}
