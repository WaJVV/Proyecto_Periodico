
package com.ProyectoFinal.controller;

import com.ProyectoFinal.service.EconomiaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/economia")
public class EconomiaController {
    
    @Autowired
    private EconomiaService economiaService;
    
    @GetMapping("/listado")
    public String inicio(Model model){
        var economia = economiaService.getEconomia(false);
        model.addAttribute("economia", economia);
        model.addAttribute("totalEconomia", economia.size());
        return "/economia/listado";
    }
}
