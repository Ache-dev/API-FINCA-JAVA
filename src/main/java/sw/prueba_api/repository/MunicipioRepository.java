package sw.prueba_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sw.prueba_api.models.Municipio;

public interface MunicipioRepository extends JpaRepository<Municipio, Long> {
    // Métodos personalizados si se necesitan
}
