/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoFinal.dao;
import com.ProyectoFinal.domain.Deportes;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DeportesDao extends JpaRepository<Deportes, Long>{
    
}
