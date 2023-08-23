/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoFinal.service.impl;

import com.ProyectoFinal.domain.Contactenos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ProyectoFinal.dao.ContactenosDao;
import com.ProyectoFinal.service.ContactenosService;

/**
 *
 * @author wayne
 */
@Service
public class ContactenosServiceImpl implements ContactenosService {

    @Autowired
    private ContactenosDao contactoDao;

    @Override
    @Transactional
    public List<Contactenos> getContacto() {

        return contactoDao.findAll();
    }

    @Override
    @Transactional
    public void save(Contactenos contacto) {
        contactoDao.save(contacto);
    }

}
