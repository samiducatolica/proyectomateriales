package com.ucatolica.materialeshexagonal2023.infrastructure.repositories;

import com.ucatolica.materialeshexagonal2023.infrastructure.entities.ColorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaColorRepository extends JpaRepository<ColorEntity, Long> {

}

/**
 * Interfaz que extiende de JpaRepository y define las operaciones de persistencia de la entidad ColorEntity
 * en la base de datos usando JPA.
 * @param <ColorEntity> la entidad ColorEntity que se persistirá en la base de datos
 * @param <Long> el tipo de dato del identificador único de la entidad ColorEntity
 */