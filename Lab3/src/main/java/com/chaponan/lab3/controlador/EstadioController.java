package com.chaponan.lab3.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EstadioController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    @ResponseBody
    public String paginaPrincipal(){
        return "Quiero pasar el lab";
    }


}
