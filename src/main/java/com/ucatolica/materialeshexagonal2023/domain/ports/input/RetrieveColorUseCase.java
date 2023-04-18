package com.ucatolica.materialeshexagonal2023.domain.ports.input;

import com.ucatolica.materialeshexagonal2023.domain.model.Color;
import java.util.List;
import java.util.Optional;

/**
 *  * RetrieveColorUseCase: es la operación de "Read" o "Leer" del CRUD, encargada de recuperar un color existente del sistema.
 */

public interface RetrieveColorUseCase {

    /**
     *
     * @param id
     * @return
     *
     * getColor: recibe como parámetro un identificador de tipo "Long" y devuelve un objeto de tipo "Optional<Color>"
     * que representa el color correspondiente al identificador proporcionado.
     * Si el color existe en el sistema, el objeto "Optional" contiene el color.
     * Si no existe, el objeto "Optional" es vacío.
     *
     * getAllColor: no recibe parámetros y devuelve una lista de objetos de tipo "Color" que representan todos los
     * colores existentes en el sistema.
     */

    Optional<Color> getColorById(Long id);
    List<Color> getAllColors();

}
