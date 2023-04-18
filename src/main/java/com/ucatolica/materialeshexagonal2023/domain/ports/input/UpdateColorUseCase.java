package com.ucatolica.materialeshexagonal2023.domain.ports.input;

import com.ucatolica.materialeshexagonal2023.domain.model.Color;
import java.util.Optional;

/**
 * UpdateColorUseCase: es la operación de "Update" o "Actualizar" del CRUD, encargada de actualizar un color existente en el sistema.
 */
public interface UpdateColorUseCase {

    /**
     *
     * @param id
     * @param updatedColor
     * @return
     * El metodo recibe como parámetros un identificador de tipo "Long" y un objeto de tipo "Color" que
     * contiene la información actualizada del color.
     *
     * El método devuelve un objeto de tipo "Optional<Color>" que representa el color actualizado en caso
     * de que se haya actualizado correctamente.
     *
     */
    Optional<Color> updateColor(Long id, Color updatedColor);

}
