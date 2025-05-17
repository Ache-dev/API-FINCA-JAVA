package sw.prueba_api.servicies;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sw.prueba_api.models.Imagen;
import sw.prueba_api.repository.ImagenRepository;

@Service
public class ImagenService {

    @Autowired
    ImagenRepository _ImagenRepository;

    public ArrayList<Imagen> ListarImagenes() {
        return (ArrayList<Imagen>) _ImagenRepository.findAll();
    }

    public Imagen GuardarImagen(Imagen imagen) {
        return _ImagenRepository.save(imagen);
    }

    public boolean BorrarImagen(Long id) {
        try {
            _ImagenRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
