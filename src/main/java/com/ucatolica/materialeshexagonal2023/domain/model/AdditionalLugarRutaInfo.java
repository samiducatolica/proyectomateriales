package com.ucatolica.materialeshexagonal2023.domain.model;

public class AdditionalLugarRutaInfo {
    private final Long lugarId;
    private final int registrosLugarRuta;

    public AdditionalLugarRutaInfo(Long lugarId, int registrosLugarRuta) {
        this.lugarId = lugarId;
        this.registrosLugarRuta=registrosLugarRuta;
    }

    public Long getLugarId() {
        return lugarId;
    }

    public int getRegistrosLugarRuta() {
        return registrosLugarRuta;
    }
}
