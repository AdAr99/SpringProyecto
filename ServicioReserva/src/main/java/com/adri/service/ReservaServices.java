package com.adri.service;

import com.adri.model.Reserva;

import java.util.List;

public interface ReservaServices {
    void registrar(Reserva reserva, int plazasreserva);
    List<Reserva> lista(String nombrehotel);

}
