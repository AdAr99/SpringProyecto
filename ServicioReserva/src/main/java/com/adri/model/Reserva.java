package com.adri.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="reserva")
public class Reserva {
    @Id
    private int idreserva;
    private String nombrecliente;
    private String dni;
    private int idhotel;
    private int idvuelo;

    public Reserva() {
    }
    public Reserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public Reserva(int idreserva, String nombrecliente, String dni, int idhotel, int idvuelo) {
        this.idreserva = idreserva;
        this.nombrecliente = nombrecliente;
        this.dni = dni;
        this.idhotel = idhotel;
        this.idvuelo = idvuelo;
    }

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(int idhotel) {
        this.idhotel = idhotel;
    }

    public int getIdvuelo() {
        return idvuelo;
    }

    public void setIdvuelo(int idvuelo) {
        this.idvuelo = idvuelo;
    }
}
