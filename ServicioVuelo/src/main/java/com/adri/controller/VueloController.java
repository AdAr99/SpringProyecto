package com.adri.controller;

import com.adri.model.Vuelo;
import com.adri.service.VueloServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VueloController {
    @Autowired
    VueloServices service;

    @GetMapping(value = "vuelo/{plazas}",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Vuelo> lista(@PathVariable int plazas){
        return service.lista(plazas);
    }

    @PutMapping(value = "vuelo/{idvuelo}/{plazasreservadas}")
    public void reservarplazas(@PathVariable int idvuelo,@PathVariable int plazasreservadas){
        service.reservarplazas(idvuelo,plazasreservadas);
    }
    @GetMapping(value = "vueloId/{idvuelo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public int plazasdisponible(@PathVariable int idvuelo){
        return service.plazasdisponible(idvuelo);
    }
}
