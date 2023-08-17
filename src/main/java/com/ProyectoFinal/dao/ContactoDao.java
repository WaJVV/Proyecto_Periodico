/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoFinal.dao;
import com.ProyectoFinal.domain.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactoDao extends JpaRepository<Contacto, Long>{
    
}
