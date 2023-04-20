package com.ucatolica.materialeshexagonal2023.domain.ports.input;

import com.ucatolica.materialeshexagonal2023.domain.model.LugarRuta;

import java.util.List;
import java.util.Optional;

public interface RetrieveLugarRutaUseCase {
    Optional<LugarRuta> getLugarRuta(Long id);
    List<LugarRuta> getAllTask();
}
