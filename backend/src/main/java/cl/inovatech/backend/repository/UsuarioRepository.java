package cl.inovatech.backend.repository;

import cl.inovatech.backend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
}