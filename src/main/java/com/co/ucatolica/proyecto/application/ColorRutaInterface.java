package com.co.ucatolica.proyecto.application;

import com.co.ucatolica.proyecto.infraestructure.config.ColorRuta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;

/**
 * @author Brayan Peña
 */
public interface ColorRutaInterface extends JpaRepository<ColorRuta, Long> {

    /**
     *
     * @param color
     * @return
     * @apiNote
     * El método findColorByColor devuelve un objeto Optional que puede contener
     * un ColorRuta si se encuentra en la base de datos un registro que cumpla
     * con la consulta personalizada. Si no se encuentra ningún registro, el Optional estará vacío.
     */
    @Query("SELECT l FROM colorRuta l WHERE l.cod_color = ?1")
    Optional<ColorRuta>findColorByColor(String color);
}
