package sw.prueba_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sw.prueba_api.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Métodos personalizados si se requieren
}
