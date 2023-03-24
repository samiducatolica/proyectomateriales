/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.co.ucatolica.proyecto.application;

import com.co.ucatolica.proyecto.infraestructure.config.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author samid
 */
public interface UsuarioInterface extends JpaRepository<Usuario, Long> {
    
}
