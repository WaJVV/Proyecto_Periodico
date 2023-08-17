
package com.ProyectoFinal.controller;

import com.ProyectoFinal.service.TecnologiaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/tecnologia")
public class TecnologiaController {
    
    @Autowired
    private TecnologiaService tecnologiaService;
    
    @GetMapping("/listado")
    public String inicio(Model model){
        var tecnologia = tecnologiaService.getTecnologia(false);
        model.addAttribute("tecnologia", tecnologia);
        model.addAttribute("totalTecnologia", tecnologia.size());
        return "/tecnologia/listado";
    }
}
