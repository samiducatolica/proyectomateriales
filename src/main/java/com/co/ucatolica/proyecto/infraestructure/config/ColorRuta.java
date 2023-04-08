package com.co.ucatolica.proyecto.infraestructure.config;

import jakarta.persistence.*;

/**
 * @author Brayan Peña
 */

@Entity(name = "colorRuta")
@Table(
        name = "color_ruta",
        uniqueConstraints = {
                @UniqueConstraint(name = "color_ruta",columnNames = "color")
        }
)

public class ColorRuta {

    /**
     * @Id indica que el atributo correspondiente es la clave primaria de la entidad
     */
    @Id

    /**
     * @SequenceGenerator es utilizada para generar valores para la clave primaria,
     * en este caso se está definiendo una secuencia llamada "color_ruta_sequence"
     * con un tamaño de asignación de 1.
     */
    @SequenceGenerator(
            name = "color_ruta_sequence",
            sequenceName = "color_ruta_sequence",
            allocationSize = 1
    )

    /**
     * @GeneratedValue indica que el valor de la clave primaria será generado automáticamente
     * utilizando la estrategia de secuencia definida previamente.
     */
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "color_ruta_sequence"
    )

    /**
     * @Column es utilizada para definir las propiedades de la columna correspondiente
     * a este atributo en la tabla de la base de datos en este caso se especifica el
     * nombre de la columna como "Id" y se indica que no puede ser actualizada.
     */
    @Column(
            name = "Id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "cod_color",
            nullable = false,
            columnDefinition = "TEXT",
            length = 10
    )
    private String cod_color;
    @Column(
            name = "descripc",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String descripc;
    private boolean bloquear;

    /**
     * Constructores
     * La clase tiene dos constructores,
     * uno sin argumentos y otro con los tres argumentos correspondientes a las columnas de la tabla
     */
    public ColorRuta() {
    }

    public ColorRuta(String cod_color, String descripc, boolean bloquear) {
        this.cod_color = cod_color;
        this.descripc = descripc;
        this.bloquear = bloquear;
    }

    /**
     * Métodos getter y setter para cada atributo
     * @return
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCod_color() {
        return cod_color;
    }

    public void setCod_color(String cod_color) {
        this.cod_color = cod_color;
    }

    public String getDescripc() {
        return descripc;
    }

    public void setDescripc(String descripc) {
        this.descripc = descripc;
    }

    public boolean isBloquear() {
        return bloquear;
    }

    public void setBloquear(boolean bloquear) {
        this.bloquear = bloquear;
    }

    /**
     * Un método toString() que devuelve una representación en formato de cadena de la instancia de la clase
     * @return
     */

    @Override
    public String toString() {
        return "ColorRuta{" +
                "cod_color='" + this.cod_color + '\'' +
                ", descripc='" + this.descripc + '\'' +
                ", bloquear=" + this.bloquear +
                '}';
    }
}

