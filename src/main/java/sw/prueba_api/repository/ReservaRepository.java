package sw.prueba_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sw.prueba_api.models.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    // Métodos personalizados si se requieren
}
