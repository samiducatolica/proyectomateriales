package com.ucatolica.materialeshexagonal2023.domain.ports.input;

/**
 * DeleteColorUseCase: es la operación de "Delete" o "Eliminar" del CRUD, encargada de eliminar un color existente del sistema.
 */
public interface DeleteColorUseCase {

    /**
     *
     * @param id
     * @return
     *
     * El método "deleteColor" se encarga de eliminar un color existente en la aplicación a partir de que recibe
     * como parámetro un identificador de tipo "long".
     *
     * Una ves se recibe el identificador del color este devuelve un valor booleano que indica si la eliminación
     * ha sido exitosa.
     */

    boolean deleteColor(Long id);

}
