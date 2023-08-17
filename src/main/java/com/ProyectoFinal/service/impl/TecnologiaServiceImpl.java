/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoFinal.service.impl;

import com.ProyectoFinal.dao.TecnologiaDao;
import com.ProyectoFinal.domain.Tecnologia;
import com.ProyectoFinal.service.TecnologiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wayne
 */
@Service
public class TecnologiaServiceImpl implements TecnologiaService{
 
    
    @Autowired
    private TecnologiaDao tecnologiaDao;


    @Override
    public List<Tecnologia> getTecnologia(boolean activo) {
        var lista = tecnologiaDao.findAll();
        if (activo){
            lista.removeIf(e -> !e.isActivo());
        }
         return lista;
    }
    
}
