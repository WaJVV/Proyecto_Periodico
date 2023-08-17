/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoFinal.service.impl;

import com.ProyectoFinal.dao.SucesosDao;
import com.ProyectoFinal.domain.Sucesos;
import com.ProyectoFinal.service.SucesosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wayne
 */
@Service
public class SucesosServiceImpl implements SucesosService{
 
    
    @Autowired
    private SucesosDao sucesosDao;


    @Override
    public List<Sucesos> getSucesos(boolean activo) {
        var lista = sucesosDao.findAll();
        if (activo){
            lista.removeIf(e -> !e.isActivo());
        }
         return lista;
    }
    
}
