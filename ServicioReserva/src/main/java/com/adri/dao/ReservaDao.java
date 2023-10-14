package com.adri.dao;

import com.adri.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Adri
 * @see org.springframework.data.jpa.repository.JpaRepository
 *
 * @Query Mostramos la lista de reservas que esten en un hotel determinado
 */

public interface ReservaDao extends JpaRepository<Reserva, Integer> {

    @Query("Select l.nombrecliente, l.dni, l.idvuelo FROM Reserva l WHERE l.idreserva = ?1")
    public List<Reserva> lista(int idh);

}
