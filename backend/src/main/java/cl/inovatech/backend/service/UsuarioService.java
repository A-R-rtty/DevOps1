package cl.inovatech.backend.service;

import cl.inovatech.backend.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public Usuario obtenerUsuario() {
        return new Usuario(1, "Benja");
    }
}