package com.adri.dao;

import com.adri.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HotelDao extends JpaRepository<Hotel, Integer> {

    @Query("Select h FROM Hotel h WHERE h.nombre =?1")
    public Hotel buscarNombre(String nombre);
}
