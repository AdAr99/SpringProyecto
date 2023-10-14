package com.adri.dao;

import com.adri.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Adri
 * @Query Utilizamos una query que no pertenece al repositorio de JPA para conseguir
 * los datos de un objeto a partir de su nombre y no su id.
 */

public interface HotelDao extends JpaRepository<Hotel, Integer> {

    @Query("Select h FROM Hotel h WHERE h.nombre =?1")
    public Hotel buscarNombre(String nombre);
}
