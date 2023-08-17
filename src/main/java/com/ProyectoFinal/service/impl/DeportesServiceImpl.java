/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoFinal.service.impl;

import com.ProyectoFinal.dao.DeportesDao;
import com.ProyectoFinal.domain.Deportes;
import com.ProyectoFinal.service.DeportesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wayne
 */
@Service
public class DeportesServiceImpl implements DeportesService{
 
    
    @Autowired
    private DeportesDao deportesDao;


    @Override
    public List<Deportes> getDeportes(boolean activo) {
        var lista = deportesDao.findAll();
        if (activo){
            lista.removeIf(e -> !e.isActivo());
        }
         return lista;
    }
    
}
