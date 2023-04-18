package com.ucatolica.materialeshexagonal2023.domain.ports.output;

import com.ucatolica.materialeshexagonal2023.domain.model.AdditionalColorInfo;


/**
 * Esta interfaz representa un puerto para acceder a un servicio externo que proporciona información adicional
 * sobre un color en particular. El método "getAdditionalColorInfo" se utiliza para obtener información adicional
 * del color con el identificador proporcionado.
 */
public interface ExternalServicePort {

    /**
     * Este método se utiliza para obtener información adicional de un color en particular utilizando su identificador único.
     *
     * @param colorId - El identificador único del color del que se desea obtener información adicional.
     * @return - Un objeto "AdditionalColorInfo" que contiene información adicional del color, como el número de registros asociados a él.
     */
    AdditionalColorInfo getAdditionalColorInfo(Long colorId);


}
