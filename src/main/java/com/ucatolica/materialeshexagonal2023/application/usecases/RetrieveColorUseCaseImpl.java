package com.ucatolica.materialeshexagonal2023.application.usecases;

import com.ucatolica.materialeshexagonal2023.domain.ports.input.RetrieveColorUseCase;
import com.ucatolica.materialeshexagonal2023.domain.ports.output.ColorRepositoryPort;
import com.ucatolica.materialeshexagonal2023.domain.model.Color;


import java.util.List;
import java.util.Optional;

/**
 * La clase RetrieveColorUseCaseImpl implementa los casos de uso "RetrieveColorUseCase",
 * permitiendo la recuperación de colores específicos por su ID o de todos los colores almacenados
 * en el sistema.
 */
public class RetrieveColorUseCaseImpl implements RetrieveColorUseCase {

    /**
     *  El puerto de salida que se utiliza para realizar la recuperacion del objeto "Color".
     */
    public final ColorRepositoryPort colorRepositoryPort;


    /**
     * Constructor de la clase RetrieveColorUseCaseImpl.
     * @param colorRepositoryPort - El puerto de salida para la persistencia de los colores.
     */
    public RetrieveColorUseCaseImpl(ColorRepositoryPort colorRepositoryPort) {
        this.colorRepositoryPort = colorRepositoryPort;
    }


    /**
     * Recupera un color específico por su ID, y devuelve un Optional que puede contener
     * el color si se encuentra en el almacenamiento, o estar vacío si no se encuentra.
     * @param id - El ID del color que se desea recuperar.
     * @return - Un Optional que puede contener el color si se encuentra, o estar vacío si no se encuentra.
     */
    @Override
    public Optional<Color> getColorById(Long id) {
        return colorRepositoryPort.findById(id);
    }

    /**
     * Devuelve una lista de todos los colores almacenados en el sistema.
     * Para esto, utiliza el método findAll del puerto de salida ColorRepositoryPort.
     * @return - Una lista de todos los colores almacenados en el sistema.
     */
    @Override
    public List<Color> getAllColors() {
        return colorRepositoryPort.findAll();
    }
}
