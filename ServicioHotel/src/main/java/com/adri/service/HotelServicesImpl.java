package com.adri.service;

import com.adri.dao.HotelDao;
import com.adri.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Adri
 * @see com.adri.service.HotelServices
 * @see com.adri.dao.HotelDao
 *
 * @lista() Mostramos todos los hotels de la base de datos
 * @buscar() Mostramos la informacion de un Hotel obtenido por su nombre
 */

@Service
public class HotelServicesImpl implements HotelServices {

    @Autowired
    HotelDao dao;
    @Override
    public List<Hotel> lista() {
        return dao.findAll();
    }

    @Override
    public Hotel buscar(String nombre) {
        return dao.buscarNombre(nombre);
    }
}
