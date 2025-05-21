package sw.prueba_api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import sw.prueba_api.models.Reserva;
import sw.prueba_api.servicies.ReservaService;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController {

    @Autowired
    ReservaService _ReservaService;

    @GetMapping("")
    public ArrayList<Reserva> GetAll() {
        return _ReservaService.ListarReservas();
    }

    @PostMapping("/guardar")
    public Reserva Guardar(@RequestBody Reserva reserva) {
        return _ReservaService.GuardarReserva(reserva);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Reserva> DeleteReserva(@PathVariable("id") Long id) {
        boolean eliminado = _ReservaService.BorrarReserva(id);
        if (eliminado) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.internalServerError().build();
        }
    }
}
