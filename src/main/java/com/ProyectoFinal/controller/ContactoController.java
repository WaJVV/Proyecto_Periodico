
package com.ProyectoFinal.controller;

import com.ProyectoFinal.domain.Contacto;
import com.ProyectoFinal.service.ContactoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@Slf4j
@RequestMapping("/contacto")
public class ContactoController {
    
    @Autowired
    private ContactoService contactoService;
    
    @GetMapping("/listado")
    public String inicio(Model model){
        var contacto = contactoService.getContacto(false);
        model.addAttribute("contacto", contacto);
        model.addAttribute("totalContacto", contacto.size());
        return "/contacto/listado";
    }
    @PostMapping("/guardar")
    public String contactoGuardar(Contacto contacto) {        
        contactoService.save(contacto);
        return "/contacto/guardar";
    }

}
