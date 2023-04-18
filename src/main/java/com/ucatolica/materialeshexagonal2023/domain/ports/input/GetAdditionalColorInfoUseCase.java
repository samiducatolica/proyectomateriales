package com.ucatolica.materialeshexagonal2023.domain.ports.input;

import com.ucatolica.materialeshexagonal2023.domain.model.AdditionalColorInfo;


/**
 * GetAdditionalColorInfoUseCase: Este caso de uso se encarga de obtener información adicional de un color existente
 * en el sistema.
 *
 * Por ejemplo, podría devolver la lista de lugares asignados a un color, los comentarios asociados al color,
 * el estado actual del color, etc.
 */
public interface GetAdditionalColorInfoUseCase {

    /**
     *
     * @param colorId
     * @return
     *
     * El método getAdditionalColorInfo() toma un identificador único de color y devuelve un objeto AdditionalColorInfo
     * que contiene información adicional sobre el color, como su temperatura de color, su brillo, etc.
     * Este método puede ser útil en casos donde se requiere información detallada sobre un color específico.
     */
    AdditionalColorInfo getAdditionalColorInfo(Long colorId);

}
