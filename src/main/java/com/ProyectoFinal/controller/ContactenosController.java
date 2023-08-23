package com.ProyectoFinal.controller;

import com.ProyectoFinal.domain.Contactenos;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ProyectoFinal.service.ContactenosService;

@Controller
@Slf4j
@RequestMapping("/contacto")
public class ContactenosController {

    @Autowired
    private ContactenosService contactoService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var contacto = contactoService.getContacto();
        model.addAttribute("contactenos", contacto);
        model.addAttribute("totalContacto", contacto.size());
        return "/contactenos/listado";
    }

    @PostMapping("/guardar")
public String guardarContacto(@ModelAttribute("contactenos") Contactenos contacto) {
    contactoService.save(contacto);
    return "redirect:/contactenos/listado"; // Redireccionar a la página de listado
}

}
