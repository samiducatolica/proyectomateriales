package com.ucatolica.materialeshexagonal2023.domain.model;

/**
 * La clase Color representa un color en el sistema.
 */

public class Color {

    private Long id;
    private String codColor;
    private String descripcion;
    private boolean bloquear;



    /**
     * Crea un objeto Color con el identificador, el código de color, la descripción y el estado de bloqueo
     * especificados.
     *
     * @param id          el identificador del color.
     * @param codColor    el código del color.
     * @param descripcion la descripción del color.
     * @param bloquear    el estado de bloqueo del color.
     */

    public Color(Long id, String codColor, String descripcion, boolean bloquear) {
        this.id = id;
        this.codColor = codColor;
        this.descripcion = descripcion;
        this.bloquear = bloquear;
    }

    /**
     * Devuelve el identificador del color.
     *
     * @return el identificador del color.
     */

    public Long getId() {
        return id;
    }

    /**
     * Establece el identificador del color.
     *
     * @param id el identificador del color.
     */

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Devuelve el código de color.
     *
     * @return el código de color.
     */
    public String getCodColor() {
        return codColor;
    }

    /**
     * Establece el código de color.
     *
     * @param codColor el código de color.
     */
    public void setCodColor(String codColor) {
        this.codColor = codColor;
    }

    /**
     * Devuelve la descripción del color.
     *
     * @return la descripción del color.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del color.
     *
     * @param descripcion la descripción del color.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Devuelve el estado de bloqueo del color.
     *
     * @return el estado de bloqueo del color.
     */
    public boolean isBloquear() {
        return bloquear;
    }

    /**
     * Establece el estado de bloqueo del color.
     *
     * @param bloquear el estado de bloqueo del color.
     */
    public void setBloquear(boolean bloquear) {
        this.bloquear = bloquear;
    }


}

