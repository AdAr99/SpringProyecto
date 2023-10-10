package com.adri.service;

import com.adri.model.Hotel;

import java.util.List;

public interface HotelServices {
    List<Hotel> lista();
    Hotel buscar(String nombre);
}
