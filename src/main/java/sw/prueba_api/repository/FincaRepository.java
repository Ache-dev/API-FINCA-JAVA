package sw.prueba_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sw.prueba_api.models.Finca;

public interface FincaRepository extends JpaRepository<Finca, Long> {
    // Aquí puedes agregar métodos personalizados si los necesitas
}
