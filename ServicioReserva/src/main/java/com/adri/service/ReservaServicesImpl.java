package com.adri.service;

import com.adri.dao.ReservaDao;
import com.adri.model.Hotel;
import com.adri.model.Reserva;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Adri
 * @see com.adri.service.ReservaServices
 * @see com.adri.dao.ReservaDao
 * @see com.adri.servicioreserva.ServicioReservaApplication
 *
 * @param "urlhotel" Url del microservicio de hotel
 * @param "urlvuelo" Url del microservicio de vuelo
 *
 * @registrar Metodo para crear una reserva, teniendo en cuenta el numero de plazas disponibles que tiene el vuelo.
 * @listar Metodo para mostrar la lista de reservas de un hotel determinado
 */

@Service
public class ReservaServicesImpl implements ReservaServices{

    @Autowired
    ReservaDao dao;
    @Autowired
    RestTemplate template;

     String urlhotel = "http://localhost:8080/";
     String urlvuelo = "http://localhost:9000/";

    @Override
    public void registrar(Reserva reserva, int plazasreserva) {


        int plazasrestantes = template.getForObject(urlvuelo+"vueloId/"+reserva.getIdvuelo(), Integer.class);

        if(reserva != null && plazasreserva > 0){
            if(plazasrestantes>=plazasreserva){
                template.put(urlvuelo+"vuelo/"+reserva.getIdvuelo()+"/"+plazasreserva, Integer.class);
                dao.save(reserva);
            }
        }
    }

    @Override
    public List<Reserva> lista(String nombrehotel) {
        Hotel hotel = template.getForObject(urlhotel+"hotel/"+nombrehotel, Hotel.class);
        return dao.lista(hotel.getIdhotel());
    }
}
