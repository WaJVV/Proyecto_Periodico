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
@Table(name = "contactenos")
public class Contactenos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contactenos")
    private Long id_contactenos;
    private String nombre;
    private String apellido;
    private String correo ;
    private String tema_consulta;
    

    public Contactenos() {
    }

    public Contactenos(Long id_contactenos, String nombre, String apellido, String correo, String tema_consulta, boolean activo) {
        this.id_contactenos = id_contactenos;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.tema_consulta = tema_consulta;
      
    }

    

}
