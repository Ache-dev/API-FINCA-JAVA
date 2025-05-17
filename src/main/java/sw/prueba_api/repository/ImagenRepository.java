package sw.prueba_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sw.prueba_api.models.Imagen;

public interface ImagenRepository extends JpaRepository<Imagen, Long> {
    // Métodos personalizados si se requieren
}
