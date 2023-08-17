
package com.ProyectoFinal.controller;

import com.ProyectoFinal.service.SucesosService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/sucesos")
public class SucesosController {
    
    @Autowired
    private SucesosService sucesosService;
    
    @GetMapping("/listado")
    public String inicio(Model model){
        var sucesos = sucesosService.getSucesos(false);
        model.addAttribute("sucesos", sucesos);
        model.addAttribute("totalSucesos", sucesos.size());
        return "/sucesos/listado";
    }
}
