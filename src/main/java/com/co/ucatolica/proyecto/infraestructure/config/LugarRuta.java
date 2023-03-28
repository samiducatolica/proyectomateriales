/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co.ucatolica.proyecto.infraestructure.config;

import com.co.ucatolica.proyecto.application.LugarRutaInterface;
import jakarta.persistence.*;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;


/**
 *
 * @author samid
 */
@Entity(name = "lugarRuta")
@Table(
        name = "lugar_ruta",
        uniqueConstraints = {
            @UniqueConstraint(name = "lugar_ruta_lugar",columnNames = "lugar")
        }
)
public class LugarRuta {
    LugarRutaInterface iLugarRuta;
    @Id
    
    @SequenceGenerator(
            name = "lugar_ruta_sequence",
            sequenceName = "lugar_ruta_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "lugar_ruta_sequence"        
    )
    @Column(
            name = "Id",
            updatable = false
    )
    private Long id;
    
    @Column(
            name = "lugar",
            nullable = false,
            columnDefinition = "TEXT",
            length = 10
    )
    private String lugar;
    
    @Column(
            name = "descripcion",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String descripcion;
    
    @Column(
            name = "ubicacion",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String ubicacion;
    
    private Boolean bloquear;

    public LugarRuta(String lugar, String descripcion, String ubicacion, Boolean bloquear) {
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.bloquear = bloquear;
    }

    public LugarRuta() {
    }

    public LugarRuta(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "LugarRuta{" + "id=" + id + ", lugar=" + lugar + ", descripcion=" + descripcion + ", ubicacion=" + ubicacion + ", bloquear=" + bloquear + '}';
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * @param lugar the lugar to set
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the bloquear
     */
    public Boolean getBloquear() {
        return bloquear;
    }

    /**
     * @param bloquear the bloquear to set
     */
    public void setBloquear(Boolean bloquear) {
        this.bloquear = bloquear;
    }
    
    public boolean existeLugar(String lugar){
        return iLugarRuta.findLugarByLugar(lugar).isEmpty();
    }
    
    public void guardarLugar(LugarRuta luRu){
        if(this.existeLugar(luRu.lugar)){
            System.out.println("Ya existe un lugar registrado en el sistema.");
        }else{
            iLugarRuta.save(luRu);
            System.out.println("Lugar guardado con exito.");
        }
    }
    
    public void consultarLugar(LugarRuta luRu){
        if(this.existeLugar(luRu.lugar)){
            System.out.println(iLugarRuta.findLugarByLugar(luRu.lugar));
        }else{
            System.out.println("No existe el lugar solicitado");
        }
    }
    
    public void borrarLugar(LugarRuta luRu){
        if(this.existeLugar(luRu.lugar)){
           luRu.setBloquear(true);
           iLugarRuta.save(luRu);
        }else{
            System.out.println("No existe el lugar solicitado");
        }
    }
}
