/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoFinal.service.impl;

import com.ProyectoFinal.dao.EconomiaDao;
import com.ProyectoFinal.domain.Economia;
import com.ProyectoFinal.service.EconomiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wayne
 */
@Service
public class EconomiaServiceImpl implements EconomiaService{
 
    
    @Autowired
    private EconomiaDao economiaDao;


    @Override
    public List<Economia> getEconomia(boolean activo) {
        var lista = economiaDao.findAll();
        if (activo){
            lista.removeIf(e -> !e.isActivo());
        }
         return lista;
    }
    
}
