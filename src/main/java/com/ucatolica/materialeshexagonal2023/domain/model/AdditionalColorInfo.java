package com.ucatolica.materialeshexagonal2023.domain.model;


/**
 * Esta clase representa a campos de información adicional relacionada con un color específico.
 */
public class AdditionalColorInfo {

    private final long idColor;
    private final int registrosColor;

    /**

     Constructor de la clase AdditionalColorInfo.
     @param idColor - El ID del color.
     @param registrosColor - La cantidad de registros asociados a ese color.
     */
    public AdditionalColorInfo(long idColor, int registrosColor) {
        this.idColor = idColor;
        this.registrosColor = registrosColor;
    }

    /**
     *
     * @return - El ID del color.
     */
    public long getIdColor() {
        return idColor;
    }

    /**
     *
     * @return - La cantidad de registros asociados a ese color.
     */
    public int getRegistrosColor() {
        return registrosColor;
    }
}


