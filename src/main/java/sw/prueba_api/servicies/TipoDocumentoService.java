package sw.prueba_api.servicies;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sw.prueba_api.models.TipoDocumento;
import sw.prueba_api.repository.TipoDocumentoRepository;

@Service
public class TipoDocumentoService {

    @Autowired
    TipoDocumentoRepository _TipoDocumentoRepository;

    public ArrayList<TipoDocumento> ListarTipoDocumentos() {
        return (ArrayList<TipoDocumento>) _TipoDocumentoRepository.findAll();
    }

    public TipoDocumento GuardarTipoDocumento(TipoDocumento tipoDocumento) {
        return _TipoDocumentoRepository.save(tipoDocumento);
    }

    public boolean BorrarTipoDocumento(Long id) {
        try {
            _TipoDocumentoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
