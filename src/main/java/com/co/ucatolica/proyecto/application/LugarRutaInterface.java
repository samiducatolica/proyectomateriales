/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.co.ucatolica.proyecto.application;

import com.co.ucatolica.proyecto.infraestructure.config.LugarRuta;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author samid
 */
public interface LugarRutaInterface extends JpaRepository<LugarRuta, Long>{
    @Query("SELECT l FROM lugarRuta l WHERE l.lugar = ?1")
    Optional<LugarRuta>findLugarByLugar(String lugar);
    
}
