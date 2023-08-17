/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoFinal.dao;
import com.ProyectoFinal.domain.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TecnologiaDao extends JpaRepository<Tecnologia, Long>{
    
}
