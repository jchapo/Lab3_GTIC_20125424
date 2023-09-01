package com.chaponan.lab3.controlador;

import com.chaponan.lab3.entity.Estadio;
import com.chaponan.lab3.repository.EstadioRepository;
import com.chaponan.lab3.repository.JugadorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/estadio")
public class EstadioController {

    final EstadioRepository estadioRepository;

    public EstadioController(EstadioRepository estadioRepository) {

        this.estadioRepository = estadioRepository;
    }

    @GetMapping(value = {"", "/listar"})
    public String listar(Model model) {
        model.addAttribute("lista", estadioRepository.findAll());
        return "estadio/list";
    }

    @GetMapping("/new")
    public String crear() {
        return "estadio/newform";

    }

    @GetMapping("/borrar")
    public String borrar(@RequestParam("id") int id) {

        Optional<Estadio> optional = estadioRepository.findById(id);

        if (optional.isPresent()) {
            estadioRepository.deleteById(id);
        }

        return "redirect:/estadio/list";
    }

    @PostMapping("/guardar")
    public String guardar(Estadio estadio) {
        estadioRepository.save(estadio);
        return "redirect:/estadio/listar";
    }
}
