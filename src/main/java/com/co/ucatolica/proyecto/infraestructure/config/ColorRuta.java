package com.co.ucatolica.proyecto.infraestructure.config;

import com.co.ucatolica.proyecto.application.ColorRutaInterface;
import jakarta.persistence.*;

/**
 * @author Brayan Peña
 */

@Entity(name = "colorRuta")
@Table(
        name = "color_ruta",
        uniqueConstraints = {
                @UniqueConstraint(name = "color_ruta_color",columnNames = "color")
        }
)

public class ColorRuta {

    ColorRutaInterface iColorRuta;

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
            length = 12
    )
    private String cod_color;
    @Column(
            name = "descripcion",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String descripcion;
    private boolean bloquear;

    /**
     * Constructores
     * La clase tiene dos constructores,
     * uno sin argumentos y otro con los tres argumentos correspondientes a las columnas de la tabla
     */
    public ColorRuta() {
    }

    public ColorRuta(String cod_color) {
        this.cod_color = cod_color;
    }

    public ColorRuta(String cod_color, String descripcion, boolean bloquear) {
        this.cod_color = cod_color;
        this.descripcion = descripcion;
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

    public String getDescripcion() {return descripcion;}

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
                "cod_color='" + cod_color + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", bloquear=" + bloquear +
                '}';
    }

    /**
     *
     * @param cod_color
     * @return
     * @apiNote
     * El método, llamado "existeColor", recibe un código de color como parámetro y devuelve un valor booleano
     * que indica si existe o no un color con ese código en el sistema.
     * Este método utiliza una interfaz llamada "iColorRuta" que extiende la interfaz JpaRepository y define un método
     * personalizado "findColorByColor", que busca un color por su código.
     * Si el resultado de la búsqueda es una lista vacía, significa que no existe el color en el sistema y el método devuelve "true".
     * De lo contrario, devuelve "false", lo que indica que el color ya existe.
     *
     */

    public boolean existeColor(String cod_color){
        return iColorRuta.findColorByColor(cod_color).isEmpty();
    }

    /**
     *
     * @param CoRu
     * @apiNote
     * El método, llamado "crearLugar", recibe un objeto "ColorRuta" como parámetro y
     * verifica si ya existe un color con el mismo código en el sistema, utilizando el método "existeColor".
     * Si el color no existe, se guarda utilizando la interfaz "iColorRuta" y se imprime un mensaje de éxito en la consola.
     * De lo contrario, se imprime un mensaje de error indicando que ya existe un color registrado en el sistema.
     */
    public void crearLugar(ColorRuta CoRu){
        if (!this.existeColor(CoRu.cod_color)) {
            iColorRuta.save(CoRu);
            System.out.println("Color guardado con exito.");
        } else {
            System.out.println("Ya existe un color registrado en el sistema.");
        }
    }





}

