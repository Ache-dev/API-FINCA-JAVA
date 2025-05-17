package sw.prueba_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sw.prueba_api.models.TipoDocumento;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento, Long> {
    // Métodos personalizados si se requieren
}
