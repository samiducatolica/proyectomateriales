package com.ucatolica.materialeshexagonal2023.domain.ports.output;

import com.ucatolica.materialeshexagonal2023.domain.model.Color;

import java.util.List;
import java.util.Optional;

/**
 * La interfaz ColorRepositoryPort define las operaciones básicas para el almacenamiento y recuperación
 * de objetos Color en la base de datos del sistema.
 */

public interface ColorRepositoryPort {

    /**
     * Almacena un objeto "Color" en la base de datos del sistema.
     * @param color - El objeto "Color" que se desea almacenar en la base de datos.
     * @return - El objeto "Color" almacenado en la base de datos.
     */
    Color save(Color color);

    /**
     * Busca un objeto "Color" en la base de datos del sistema, utilizando su identificador único.
     * @param id - El identificador único del objeto "Color" que se desea buscar en la base de datos.
     * @return - Un objeto "Optional" que contiene el objeto "Color" encontrado en la base de datos, si existe.
     */
    Optional<Color> findById(Long id);

    /**
     * Recupera todos los objetos "Color" almacenados en la base de datos del sistema.
     * @return - Una lista de objetos "Color" almacenados en la base de datos.
     */
    List<Color> findAll();

    /**
     * Actualiza un objeto "Color" en la base de datos del sistema.
     * @param color - El objeto "Color" que se desea actualizar en la base de datos.
     * @return - Un objeto "Optional" que contiene el objeto "Color" actualizado en la base de datos, si se actualizó correctamente.
     */
    Optional<Color> update(Color color);

    /**
     * Elimina un objeto "Color" de la base de datos del sistema, utilizando su identificador único.
     * @param id - El identificador único del objeto "Color" que se desea eliminar de la base de datos.
     * @return - Verdadero si el objeto "Color" se eliminó con éxito, falso de lo contrario.
     */
    boolean deleteById(Long id);


}
