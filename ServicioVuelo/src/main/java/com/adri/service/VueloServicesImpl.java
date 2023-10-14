package com.adri.service;

import com.adri.dao.VueloDao;
import com.adri.model.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Adri
 * @see com.adri.service.VueloServices
 * @see com.adri.dao.VueloDao
 *
 * @lista Mostramos la lista de vuelos con un numero de plazas determinados
 *
 * @reservarplazas Mediante el id del vuelo, le restamos a las plazas disponible las plazas reservadas, despues de
 * comprovar que hay suficientes.
 *
 * @plazasdisponible Obtenemos el numero de plazas de un vuelo en concreto
 */

@Service
public class VueloServicesImpl implements VueloServices{
    @Autowired
    VueloDao dao;
    @Override
    public List<Vuelo> lista(int plazas) {
        return dao.listar(plazas);
    }

    @Override
    public void reservarplazas(int idvuelo, int plazasreservadas) {
        Vuelo vuelo = dao.findById(idvuelo).orElse(null);
        if(vuelo != null && plazasreservadas < vuelo.getPlazasdisponibles()){
            vuelo.setPlazasdisponibles(vuelo.getPlazasdisponibles()-plazasreservadas);
            dao.save(vuelo);
        }
    }

    @Override
    public int plazasdisponible(int idvuelo) {
        Vuelo vuelo = dao.findById(idvuelo).orElse(null);
        return vuelo.getPlazasdisponibles();
    }
}
