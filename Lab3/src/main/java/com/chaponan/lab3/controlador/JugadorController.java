package com.chaponan.lab3.controlador;

import com.chaponan.lab3.entity.Jugador;
import com.chaponan.lab3.repository.JugadorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/jugador")
public class JugadorController {

    final JugadorRepository jugadorRepository;

    public JugadorController(JugadorRepository jugadorRepository) {

        this.jugadorRepository = jugadorRepository;
    }

    @GetMapping(value = {"", "/listar"})
    public String listar(Model model) {
        model.addAttribute("lista", jugadorRepository.findAll());
        return "jugador/list";
    }

    @GetMapping("/new")
    public String crear() {
        return "jugador/newform";

    }

    @GetMapping("/borrar")
    public String borrar(@RequestParam("id") int id) {

        Optional<Jugador> optional = jugadorRepository.findById(id);

        if (optional.isPresent()) {
            jugadorRepository.deleteById(id);
        }
        return "redirect:/jugador/list";
    }

    @PostMapping("/guardar")
    public String guardar(Jugador jugador) {
        jugadorRepository.save(jugador);
        return "redirect:/jugador/listar";
    }
}
