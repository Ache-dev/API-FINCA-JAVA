package sw.prueba_api.servicies;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sw.prueba_api.models.Reserva;
import sw.prueba_api.repository.ReservaRepository;

@Service
public class ReservaService {

    @Autowired
    ReservaRepository _ReservaRepository;

    public ArrayList<Reserva> ListarReservas() {
        return (ArrayList<Reserva>) _ReservaRepository.findAll();
    }

    public Reserva GuardarReserva(Reserva reserva) {
        return _ReservaRepository.save(reserva);
    }

    public boolean BorrarReserva(Long id) {
        try {
            _ReservaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
