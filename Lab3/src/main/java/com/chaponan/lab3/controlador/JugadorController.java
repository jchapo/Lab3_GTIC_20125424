package com.chaponan.lab3.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/jugador")
public class JugadorController {

    final JugadorRepository jugadorRepository;

    public JugadorController(JugadorRepository jugadorRepository) {

        this.jugadorRepository = jugadorRepository;
    }

    @GetMapping(value = {"", "/listar"})
    public String listar(Model model) {
        model.addAttribute("lista", shipperRepository.findAll());
        return "shipper/lista";
    }
}
