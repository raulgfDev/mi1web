package com.example.mi1web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//establecer ruta relativa en caso de conflictos
//del @RequestMapping
@RequestMapping("/secondController")
public class otherController {

    @RequestMapping("/getFormulario")
    public String getFormulario(){

        return "formulario";
    }

    //RR = necesario poner rutas relativas en html
    @RequestMapping("/procesaRespuesta")
    public String procesaFormulario(
            HttpServletRequest request,
            @RequestParam("edad") String edad,
            Model model)
    {
        //recibo info
        String recepcion = request.getParameter("campoFormulario");
        String recepMoficado = recepcion + " SECOND CONTROLLER";
        //paso a la vista
        model.addAttribute("viajero",recepMoficado);
        model.addAttribute("viajero2",edad);

        return "respuesta";
    }
}
