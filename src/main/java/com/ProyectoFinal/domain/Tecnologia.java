/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoFinal.domain;

import jakarta.persistence.*;
import java.io.Serializable;

import lombok.Data;

@Data
@Entity
@Table(name = "tecnologia")
public class Tecnologia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tecnologia")
    private Long id_tecnologia;
    private String nombre;
    private String descripcion;
    private String ruta_imagen;
    private String  ruta_imagen2;
    private boolean activo;

    public Tecnologia() {
    }

    public Tecnologia(Long id_tecnologia, String nombre, String descripcion, String ruta_imagen, String ruta_imagen2, boolean activo) {
        this.id_tecnologia = id_tecnologia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ruta_imagen = ruta_imagen;
        this.ruta_imagen2 = ruta_imagen2;
        this.activo = activo;
    }

    

}
