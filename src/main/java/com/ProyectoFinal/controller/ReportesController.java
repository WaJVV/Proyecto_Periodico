package com.ProyectoFinal.controller;





import com.ProyectoFinal.service.ReportesService;
import java.io.IOException;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@Slf4j
@RequestMapping("/deporte")
public class ReportesController {
    
    @Autowired
    private ReportesService reporteService;
    
    @GetMapping("/fragmentos")
    public String listado(Model model){
        return "/deporte/fragmentos";
    }
    
    
    
    @GetMapping("/usuarios")
    public ResponseEntity<Resource> ReporteDeporte(@RequestParam String tipo) throws IOException{
        var reporte = "deporte";
        return reporteService.generarReporte(reporte, null, tipo);
    }
    

    
}
