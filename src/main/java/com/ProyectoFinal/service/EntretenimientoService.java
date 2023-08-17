/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoFinal.service;

import com.ProyectoFinal.domain.Entretenimiento;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface EntretenimientoService {
    
    public List<Entretenimiento> getEntretenimiento(boolean activo);
    
}
