package com.adri.model;
public class Hotel {

    private int idhotel;
    private String nombre;
    private String categoria;
    private int precio;
    private String disponible;

    public Hotel() {
    }

    public Hotel(int idhotel) {
        this.idhotel = idhotel;
    }

    public Hotel(int idhotel, String nombre, String categoria, int precio, String disponible) {
        this.idhotel = idhotel;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.disponible = disponible;
    }

    public int getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(int idhotel) {
        this.idhotel = idhotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }
}
