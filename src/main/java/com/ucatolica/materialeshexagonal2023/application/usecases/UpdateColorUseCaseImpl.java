package com.ucatolica.materialeshexagonal2023.application.usecases;

import com.ucatolica.materialeshexagonal2023.domain.ports.input.UpdateColorUseCase;
import com.ucatolica.materialeshexagonal2023.domain.ports.output.ColorRepositoryPort;
import com.ucatolica.materialeshexagonal2023.domain.model.Color;

import java.util.Optional;

/**
 * La clase UpdateColorUseCaseImpl implementa la interfaz UpdateColorUseCase y se utiliza para actualizar un objeto "Color"
 * existente en el sistema, utilizando su identificador único.
 */
public class UpdateColorUseCaseImpl implements UpdateColorUseCase {

    /**
     *  El puerto de salida que se utiliza para realizar la actualización del objeto "Color".
     */
    private final ColorRepositoryPort colorRepositoryPort;

    /**
     * Constructor de la clase UpdateColorUseCaseImpl.
     * @param colorRepositoryPort - El puerto de salida que se utiliza para realizar la actualización del objeto "Color".
     */

    public UpdateColorUseCaseImpl(ColorRepositoryPort colorRepositoryPort) {
        this.colorRepositoryPort = colorRepositoryPort;
    }


    /**
     * Método que se utiliza para actualizar un objeto "Color" existente en el sistema, utilizando su identificador único.
     * @param id - El identificador único del objeto "Color" que se desea actualizar.
     * @param updatedColor - El objeto "Color" con la información actualizada.
     * @return - Un Optional que puede contener el objeto "Color" actualizado si se realizó la actualización con éxito,
     * o estar vacío si no se pudo realizar la actualización.
     */
    @Override
    public Optional<Color> updateColor(Long id, Color updatedColor) {
        return colorRepositoryPort.update(updatedColor);
    }
}
