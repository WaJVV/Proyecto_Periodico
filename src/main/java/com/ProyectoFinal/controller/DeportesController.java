
package com.ProyectoFinal.controller;

import com.ProyectoFinal.service.DeportesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/deporte")
public class DeportesController {
    
    @Autowired
    private DeportesService deportesService;
    
    @GetMapping("/listado")
    public String inicio(Model model){
        var deportes = deportesService.getDeportes(false);
        model.addAttribute("deportes", deportes);
        model.addAttribute("totalDeportes", deportes.size());
        return "/deporte/listado";
    }
}
