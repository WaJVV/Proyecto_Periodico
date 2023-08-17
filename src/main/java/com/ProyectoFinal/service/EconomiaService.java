/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoFinal.service;

import com.ProyectoFinal.domain.Economia;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface EconomiaService {
    
    public List<Economia> getEconomia(boolean activo);
    
}
