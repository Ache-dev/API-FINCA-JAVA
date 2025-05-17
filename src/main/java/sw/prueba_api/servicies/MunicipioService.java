package sw.prueba_api.servicies;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sw.prueba_api.models.Municipio;
import sw.prueba_api.repository.MunicipioRepository;

@Service
public class MunicipioService {

    @Autowired
    MunicipioRepository _MunicipioRepository;

    public ArrayList<Municipio> ListarMunicipios() {
        return (ArrayList<Municipio>) _MunicipioRepository.findAll();
    }

    public Municipio GuardarMunicipio(Municipio municipio) {
        return _MunicipioRepository.save(municipio);
    }

    public boolean BorrarMunicipio(Long id) {
        try {
            _MunicipioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
