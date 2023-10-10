package com.adri.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "vuelo")
public class Vuelo {
    @Id
    private int idvuelo;
    private String compañia;
    private LocalDate fechavuelo;
    private double precio;
    private int plazasdisponibles;

    public Vuelo() {
    }

    public Vuelo(int idvuelo) {
        this.idvuelo = idvuelo;
    }

    public Vuelo(int idvuelo, String compañia, LocalDate fechavuelo, double precio, int plazasdisponibles) {
        this.idvuelo = idvuelo;
        this.compañia = compañia;
        this.fechavuelo = fechavuelo;
        this.precio = precio;
        this.plazasdisponibles = plazasdisponibles;
    }

    public int getIdvuelo() {
        return idvuelo;
    }

    public void setIdvuelo(int idvuelo) {
        this.idvuelo = idvuelo;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public LocalDate getFechavuelo() {
        return fechavuelo;
    }

    public void setFechavuelo(LocalDate fechavuelo) {
        this.fechavuelo = fechavuelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPlazasdisponibles() {
        return plazasdisponibles;
    }

    public void setPlazasdisponibles(int plazasdisponibles) {
        this.plazasdisponibles = plazasdisponibles;
    }
}
