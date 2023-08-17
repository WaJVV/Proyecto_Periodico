/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoFinal.service.impl;

import com.ProyectoFinal.dao.ContactoDao;
import com.ProyectoFinal.domain.Contacto;
import com.ProyectoFinal.service.ContactoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author wayne
 */
@Service
public class ContactoServiceImpl implements ContactoService{
 
    
    @Autowired
    private ContactoDao contactoDao;


    @Override
    @Transactional(readOnly = true)
    public List<Contacto> getContacto(boolean activo) {
        var lista = contactoDao.findAll();
        if (activo){
            lista.removeIf(e -> !e.isActivo());
        }
         return lista;
    }
    
    @Override
    @Transactional
    public void save(Contacto contacto) {
        contactoDao.save(contacto);
    }
    
}
