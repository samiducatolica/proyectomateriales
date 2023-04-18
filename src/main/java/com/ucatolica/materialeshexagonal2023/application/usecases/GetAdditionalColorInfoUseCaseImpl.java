package com.ucatolica.materialeshexagonal2023.application.usecases;

import com.ucatolica.materialeshexagonal2023.domain.ports.input.GetAdditionalColorInfoUseCase;
import com.ucatolica.materialeshexagonal2023.domain.ports.output.ExternalServicePort;
import com.ucatolica.materialeshexagonal2023.domain.model.AdditionalColorInfo;

/**
 * La clase GetAdditionalColorInfoUseCaseImpl es una implementación de la interfaz GetAdditionalColorInfoUseCase
 * que representa el caso de uso "Obtener información adicional de un color"
 *
 * Este caso de uso se encarga de obtener información adicional relacionada con un objeto "Color" del sistema,
 * utilizando un servicio externo.
 *
 * La implementación utiliza el patrón de inyección de dependencias para obtener una instancia del puerto de
 * servicio externo ("ExternalServicePort"), a través del constructor de la clase.
 */
public class GetAdditionalColorInfoUseCaseImpl implements GetAdditionalColorInfoUseCase {


    private final ExternalServicePort externalServicePort;


    public GetAdditionalColorInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    /**

     Obtiene información adicional relacionada con un objeto "Color" del sistema, utilizando un servicio externo.
     @param id - El identificador único del objeto "Color" del que se desea obtener información adicional.
     @return - Un objeto "AdditionalColorInfo" que contiene la información adicional obtenida.
     */
    @Override
    public AdditionalColorInfo getAdditionalColorInfo(Long id) {
        return externalServicePort.getAdditionalColorInfo(id);
    }
}
