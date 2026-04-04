package cl.inovatech.backend.controller;

import cl.inovatech.backend.model.Usuario;
import cl.inovatech.backend.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public Usuario getUsuario() {
        return service.obtenerUsuario();
    }
}