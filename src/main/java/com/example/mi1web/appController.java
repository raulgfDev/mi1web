package com.example.mi1web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/firstController")
public class appController {

    @RequestMapping("/getFormulario")
    public String getFormulario(){

        return "formulario";
    }

    @RequestMapping("/procesaRespuesta")
    public String procesaFormulario(
            HttpServletRequest request,
            @RequestParam("edad") String edad,
            Model model)
    {
        //recibo info
        String recepcion = request.getParameter("campoFormulario");
        //proceso info
        String recepMoficado = recepcion + " King the world";
        //paso a la vista
        model.addAttribute("viajero",recepMoficado);
        model.addAttribute("viajero2",edad);

        return "respuesta";
     }
}
