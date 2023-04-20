package com.ucatolica.materialeshexagonal2023.domain.ports.input;

import com.ucatolica.materialeshexagonal2023.domain.model.LugarRuta;

import java.util.Optional;

public interface UpdateLugarRutaCase {
    Optional<LugarRuta> updateLugarRuta(Long id, LugarRuta updateLugarRuta);
}
