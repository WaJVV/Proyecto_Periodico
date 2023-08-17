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
@Table(name = "sucesos")
public class Sucesos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sucesos")
    private Long id_sucesos;
    private String nombre;
    private String descripcion;
    private String ruta_imagen;
    private boolean activo;

    public Sucesos() {
    }

    public Sucesos(Long id_sucesos, String nombre, String descripcion, String ruta_imagen, boolean activo) {
        this.id_sucesos = id_sucesos;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ruta_imagen = ruta_imagen;
        this.activo = activo;
    }

}
