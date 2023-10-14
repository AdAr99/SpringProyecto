package com.adri.service;

import com.adri.model.Vuelo;

import java.util.List;

public interface VueloServices {
    List<Vuelo> lista(int plazas);
    void reservarplazas(int idvuelo, int plazasreservadas);

    int plazasdisponible(int idvuelo);
}
