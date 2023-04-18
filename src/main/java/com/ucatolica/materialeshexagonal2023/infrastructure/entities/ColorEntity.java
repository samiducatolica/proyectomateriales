package com.ucatolica.materialeshexagonal2023.infrastructure.entities;

import com.ucatolica.materialeshexagonal2023.domain.model.Color;
import jakarta.persistence.*;


@Entity
@Table(name = "color")
public class ColorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(nullable = false)
    private String codColor;
    @Column(nullable = false)
    private String descripcion;
    @Column(nullable = false)
    private boolean bloquear;

    //Contructores

    public ColorEntity() {
    }

    public ColorEntity(Long id, String codColor, String descripcion, boolean bloquear) {
        this.id = id;
        this.codColor = codColor;
        this.descripcion = descripcion;
        this.bloquear = bloquear;
    }

    /**
     * El método "fromDomainModel" convierte un objeto de dominio "Color" en un objeto de entidad "ColorEntity".
     */

    public static ColorEntity fromDomainModel(Color color) {
        return new ColorEntity(color.getId(), color.getCodColor(), color.getDescripcion(), color.isBloquear());
    }

    /**
     *El método "toDomainModel" convierte un objeto de entidad "ColorEntity" en un objeto de dominio "Color".
     */
    public Color toDomainModel() {

        return new Color(id, codColor, descripcion, bloquear);
    }


    // Getters y setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodColor() {
        return codColor;
    }

    public void setCodColor(String codColor) {
        this.codColor = codColor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isBloquear() {
        return bloquear;
    }

    public void setBloquear(boolean bloquear) {
        this.bloquear = bloquear;
    }
}



