
package com.ProyectoFinal.controller;

import com.ProyectoFinal.service.EntretenimientoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/entretenimiento")
public class EntretenimientoController {
    
    @Autowired
    private EntretenimientoService entretenimientoService;
    
    @GetMapping("/listado")
    public String inicio(Model model){
        var entretenimiento = entretenimientoService.getEntretenimiento(false);
        model.addAttribute("entretenimiento", entretenimiento);
        model.addAttribute("totalEntretenimiento", entretenimiento.size());
        return "/entretenimiento/listado";
    }
}
