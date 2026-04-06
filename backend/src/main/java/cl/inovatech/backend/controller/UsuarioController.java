package cl.inovatech.backend.controller;

import cl.inovatech.backend.model.Usuario;
import org.springframework.web.bind.annotation.*;
import cl.inovatech.backend.repository.UsuarioRepository;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

    @GetMapping
public List<String> test(){
    return List.of("hola", "funciona");
}
}