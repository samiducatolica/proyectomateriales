package com.ucatolica.materialeshexagonal2023.domain.model;

public class LugarRuta {
    private long id;
    private String lugar;
    private  String descripcion;
    private String ubicacion;
    private Boolean bloquear;

    public LugarRuta(long id, String lugar, String descripcion, String ubicacion, Boolean bloquear) {
        this.id = id;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.bloquear = bloquear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Boolean getBloquear() {
        return bloquear;
    }

    public void setBloquear(Boolean bloquear) {
        this.bloquear = bloquear;
    }
}
