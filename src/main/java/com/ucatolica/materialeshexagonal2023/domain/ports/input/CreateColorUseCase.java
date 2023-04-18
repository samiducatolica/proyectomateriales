package com.ucatolica.materialeshexagonal2023.domain.ports.input;

import com.ucatolica.materialeshexagonal2023.domain.model.Color;



/**
 * CreateColorUseCase: es la operación de "Create" o "Crear" del CRUD, encargada de crear un nuevo color en el sistema.
 */
public interface CreateColorUseCase {

    /**
     *
     * @param color
     * @return
     * El método llamado "createColor" recibe como parámetro un objeto de tipo "Color"
     * y devuelve otro objeto de tipo "Color" que representa el color creado en la aplicación.
     */
    Color createColor(Color color);
}
