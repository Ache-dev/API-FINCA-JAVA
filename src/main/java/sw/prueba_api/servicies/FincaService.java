package sw.prueba_api.servicies;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sw.prueba_api.models.Finca;
import sw.prueba_api.repository.FincaRepository;

@Service
public class FincaService {

@Autowired
FincaRepository _FincaRepository;
public ArrayList<Finca> ListarFincas(){
    return (ArrayList<Finca>)_FincaRepository.findAll();
}

public Finca GuardarFinca(Finca f){
    return _FincaRepository.save(f);
}

public boolean BorrarFinca(Long id) {
    try {
        _FincaRepository.deleteById(id);
        return true; 
    } catch (Exception e) {
        return false;
    }
}
}

