package com.adri.dao;

import com.adri.model.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Adri
 * @see org.springframework.data.jpa.repository.JpaRepository
 *
 * @Query Mostramos los vuelos que tengan mas disponibles que las que le pasamos por parametros.
 */

public interface VueloDao extends JpaRepository<Vuelo, Integer> {

    @Query("Select v FROM Vuelo v WHERE v.plazasdisponibles >= ?1")
    List<Vuelo> listar(int plazas);
}
