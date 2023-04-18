package com.ucatolica.materialeshexagonal2023.application.services;

import com.ucatolica.materialeshexagonal2023.domain.model.AdditionalColorInfo;
import com.ucatolica.materialeshexagonal2023.domain.model.Color;
import com.ucatolica.materialeshexagonal2023.domain.ports.input.*;

import java.util.List;
import java.util.Optional;


/**
 * /**
 * Implementación del servicio de color, que proporciona las operaciones CRUD para la gestión de colores.
 */

public class ColorService implements CreateColorUseCase, RetrieveColorUseCase, UpdateColorUseCase, DeleteColorUseCase, GetAdditionalColorInfoUseCase{

    private final CreateColorUseCase createColorUseCase;
    private final RetrieveColorUseCase retrieveColorUseCase;
    private final UpdateColorUseCase updateColorUseCase;
    private final DeleteColorUseCase deleteColorUseCase;
    private final GetAdditionalColorInfoUseCase getAdditionalColorInfoUseCase;


    /**
     * @param createColorUseCase            -- Caso de uso para crear un color.
     * @param retrieveColorUseCase          -- Caso de uso para recuperar un color.
     * @param updateColorUseCase            -- Caso de uso para actualizar un color.
     * @param deleteColorUseCase            -- Caso de uso para eliminar un color.
     * @param getAdditionalColorInfoUseCase -- Caso de uso para recuperar información de color adicional.
     */
    public ColorService(CreateColorUseCase createColorUseCase, RetrieveColorUseCase retrieveColorUseCase, UpdateColorUseCase updateColorUseCase, DeleteColorUseCase deleteColorUseCase, GetAdditionalColorInfoUseCase getAdditionalColorInfoUseCase) {
        this.createColorUseCase = createColorUseCase;
        this.retrieveColorUseCase = retrieveColorUseCase;
        this.updateColorUseCase = updateColorUseCase;
        this.deleteColorUseCase = deleteColorUseCase;
        this.getAdditionalColorInfoUseCase = getAdditionalColorInfoUseCase;
    }


    /**
     * Crar un nuevo Color
     * @param color -- Color a crear.
     * @return -- Color creado.
     */
    @Override
    public Color createColor(Color color){
        return createColorUseCase.createColor(color);
    }


    /**
     * Eliminar un color
     *
     * @param id -- El ID del color que se va a eliminar.
     * @return -- Verdadero si el color se eliminó con éxito, falso en caso contrario.
     */
    @Override
    public boolean deleteColor(Long id){
        return deleteColorUseCase.deleteColor(id);
    }



    /**
     * Recupera información adicional para un color.
     *
     * @param colorId - El colorId del color.
     * @return - La información de color adicional.
     */
    @Override
    public AdditionalColorInfo getAdditionalColorInfo(Long colorId){
        return getAdditionalColorInfoUseCase.getAdditionalColorInfo(colorId);
    }


    /**
     * Recupera un color por ID
     *
     * @param id - El ID del color.
     * @return - El color con el ID dado, si existe.
     */
    @Override
    public Optional<Color> getColorById(Long id) {
        return retrieveColorUseCase.getColorById(id);
    }


    /**
     * Recupera una lista de todos los colores.
     *
     * @return - La lista de todos los colores.
     */
    @Override
    public List<Color> getAllColors() {
        return retrieveColorUseCase.getAllColors();
    }


    /**
     * Actualiza un color.
     *
     * @param id          - El ID del color a actualizar.
     * @param updatedColor - El color actualizado.
     * @return - El color actualizado, si la actualización fue exitosa.
     */
    @Override
    public Optional<Color> updateColor(Long id, Color updatedColor) {
        return updateColorUseCase.updateColor(id, updatedColor);
    }

}


