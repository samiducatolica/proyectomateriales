package com.ucatolica.materialeshexagonal2023.infrastructure.controllers;

import com.ucatolica.materialeshexagonal2023.application.services.ColorService;
import com.ucatolica.materialeshexagonal2023.domain.model.AdditionalColorInfo;
import com.ucatolica.materialeshexagonal2023.domain.model.Color;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para manejar las operaciones relacionadas con los colores.
 */

@RestController
@RequestMapping("/api/colors")
public class ColorController {
    private final ColorService colorService;

    /**
     * Constructor de la clase ColorController.
     * @param colorService Servicio encargado de gestionar las operaciones con los colores.
     */

    public ColorController(ColorService colorService) {
        this.colorService = colorService;
    }

    /**
     * Método para crear un nuevo color.
     * @param color Objeto Color con los datos del nuevo color a crear.
     * @return Objeto ResponseEntity con el resultado de la operación.
     */
    @PostMapping
    public ResponseEntity<Color> createColor(@RequestBody Color color) {
        Color createColor = colorService.createColor(color);
        return new ResponseEntity<>(createColor, HttpStatus.CREATED);
    }

    /**
     * Método para obtener un color por su identificador.
     * @param colorId Identificador del color a obtener.
     * @return Objeto ResponseEntity con el resultado de la operación.
     */
    @GetMapping("/{colorId}")
    public ResponseEntity<Color> getColorById(@PathVariable Long colorId) {
        return colorService.getColorById(colorId)
                .map(color -> new ResponseEntity<>(color, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    /**
     * Método para obtener todos los colores.
     * @return Objeto ResponseEntity con la lista de colores obtenidos.
     */
    @GetMapping
    public ResponseEntity<List<Color>> getAllColors() {
        List<Color> colors = colorService.getAllColors();
        return new ResponseEntity<>(colors, HttpStatus.OK);
    }

    /**
     * Método para actualizar un color existente.
     * @param colorId Identificador del color a actualizar.
     * @param updateColor Objeto Color con los nuevos datos del color a actualizar.
     * @return Objeto ResponseEntity con el resultado de la operación.
     */
    @PutMapping("/{colorId}")
    public ResponseEntity<Color> updateColor(@PathVariable Long colorId, @RequestBody Color updateColor) {
        return colorService.updateColor(colorId, updateColor)
                .map(color -> new ResponseEntity<>(color, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    /**
     * Método para eliminar un color existente.
     * @param colorId Identificador del color a eliminar.
     * @return Objeto ResponseEntity con el resultado de la operación.
     */
    @DeleteMapping("/{colorId}")
    private ResponseEntity<Void> deleteColorById(@PathVariable Long colorId) {
        if (colorService.deleteColor((colorId))) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    /**
     * Método para obtener información adicional de un color a través de un servicio externo.
     * @param colorId Identificador del color del cual se desea obtener información adicional.
     * @return Objeto ResponseEntity con la información adicional del color obtenida.
     */
    @GetMapping("/{colorId}/aditionalInfo")
    public ResponseEntity<AdditionalColorInfo> getAdditionalColorInfo(@PathVariable Long colorId) {
        AdditionalColorInfo additionalColorInfo = colorService.getAdditionalColorInfo(colorId);
        return new ResponseEntity<>(additionalColorInfo, HttpStatus.OK);
    }


}
