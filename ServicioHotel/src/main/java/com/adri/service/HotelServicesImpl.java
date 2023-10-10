package com.adri.service;

import com.adri.dao.HotelDao;
import com.adri.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
