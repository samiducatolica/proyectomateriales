package com.ucatolica.materialeshexagonal2023.infrastructure.repositories;

import com.ucatolica.materialeshexagonal2023.domain.ports.output.ColorRepositoryPort;
import com.ucatolica.materialeshexagonal2023.infrastructure.entities.ColorEntity;
import com.ucatolica.materialeshexagonal2023.domain.model.Color;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Esta clase actúa como un adaptador entre el puerto de repositorio de colores de dominio y la implementación del
 * repositorio JPA.
 */

@Component
public class JpaColorRepositoryAdapter implements ColorRepositoryPort {

    private final JpaColorRepository jpaColorRepository;

    /**
     * Constructor que recibe un JpaColorRepository para su uso en los métodos de repositorio de dominio.
     *
     * @param jpaColorRepository repositorio JPA de colores
     */
    public JpaColorRepositoryAdapter(JpaColorRepository jpaColorRepository) {
        this.jpaColorRepository = jpaColorRepository;
    }


    /**
     * Guarda un color en la base de datos utilizando el repositorio JPA.
     *
     * @param color el color a guardar
     * @return el color guardado
     */
    @Override
    public Color save(Color color) {
        ColorEntity colorEntity = ColorEntity.fromDomainModel(color);
        ColorEntity savedColorEntity = jpaColorRepository.save(colorEntity);
        return savedColorEntity.toDomainModel();
    }

    /**
     * Obtiene un color de la base de datos utilizando el ID del color proporcionado.
     *
     * @param id el ID del color a buscar
     * @return el color encontrado, si existe
     */
    @Override
    public Optional<Color> findById(Long id) {
        return jpaColorRepository.findById(id).map(ColorEntity::toDomainModel);
    }

    /**
     * Obtiene todos los colores de la base de datos.
     *
     * @return una lista de todos los colores encontrados
     */
    @Override
    public List<Color> findAll() {
        return jpaColorRepository.findAll().stream().map(ColorEntity::toDomainModel).collect(Collectors.toList());
    }

    /**
     * Actualiza un color en la base de datos utilizando el repositorio JPA.
     *
     * @param color el color a actualizar
     * @return el color actualizado, si existe
     */
    @Override
    public Optional<Color> update(Color color) {
        if (jpaColorRepository.existsById(color.getId())) {
            ColorEntity colorEntity = ColorEntity.fromDomainModel(color);
            ColorEntity updateColorEntity = jpaColorRepository.save(colorEntity);
            return Optional.of(updateColorEntity.toDomainModel());
        }
        return Optional.empty();
    }

    /**
     * Elimina un color de la base de datos utilizando el ID del color proporcionado.
     *
     * @param id el ID del color a eliminar
     * @return true si se eliminó el color, false si no se encontró el color con el ID proporcionado
     */
    @Override
    public boolean deleteById(Long id) {
        if (jpaColorRepository.existsById(id)) {
            jpaColorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
