package com.ucatolica.materialeshexagonal2023.domain.ports.input;

import com.ucatolica.materialeshexagonal2023.domain.model.AdditionalLugarRutaInfo;

public interface GetAdditionalLugarRutaInforUseCase {
    AdditionalLugarRutaInfo getAdditionalLugarInfo(Long id);
}
