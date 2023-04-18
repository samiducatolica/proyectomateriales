package com.ucatolica.materialeshexagonal2023.application.usecases;


import com.ucatolica.materialeshexagonal2023.domain.model.Color;
import com.ucatolica.materialeshexagonal2023.domain.ports.input.CreateColorUseCase;
import com.ucatolica.materialeshexagonal2023.domain.ports.output.ColorRepositoryPort;

/**
 * La clase CreateColorUseCaseImpl es una implementación de la interfaz CreateColorUseCase que representa
 * el caso de uso "Crear color", que permite la creación de un nuevo color mediante el uso del puerto
 *
 * La implementación utiliza el patrón de inyección de dependencias para obtener una instancia
 * del puerto de repositorio de colores
 */
public class CreateColorUseCaseImpl  implements CreateColorUseCase {

    /**
     *  El puerto de salida que se utiliza para realizar la creacion del objeto "Color".
     */
    private final ColorRepositoryPort colorRepositoryPort;


    /**

     Constructor de la clase que recibe un objeto del tipo ColorRepositoryPort.
     @param colorRepositoryPort - Puerto de salida necesario para la creación de un nuevo color.
     */
    public CreateColorUseCaseImpl(ColorRepositoryPort colorRepositoryPort) {
        this.colorRepositoryPort = colorRepositoryPort;
    }


    /**

     Crea un nuevo objeto "Color" en el sistema.
     @param color - El objeto "Color" que se quiere crear en el sistema.
     @return - El objeto "Color" recién creado en el sistema.
     */
    @Override
    public Color createColor(Color color){
        return colorRepositoryPort.save(color);
    }

}
