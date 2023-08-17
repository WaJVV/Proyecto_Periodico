/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoFinal.service.impl;

import com.ProyectoFinal.dao.EntretenimientoDao;
import com.ProyectoFinal.domain.Entretenimiento;
import com.ProyectoFinal.service.EntretenimientoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wayne
 */
@Service
public class EntretenimientoServiceImpl implements EntretenimientoService{
 
    
    @Autowired
    private EntretenimientoDao entretenimientoDao;


    @Override
    public List<Entretenimiento> getEntretenimiento(boolean activo) {
        var lista = entretenimientoDao.findAll();
        if (activo){
            lista.removeIf(e -> !e.isActivo());
        }
         return lista;
    }
    
}
