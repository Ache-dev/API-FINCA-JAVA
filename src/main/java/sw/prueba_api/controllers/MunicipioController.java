package sw.prueba_api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import sw.prueba_api.models.Municipio;
import sw.prueba_api.servicies.MunicipioService;

@RestController
@RequestMapping("/api/municipio")
public class MunicipioController {

    @Autowired
    MunicipioService _MunicipioService;

    @GetMapping("")
    public ArrayList<Municipio> GetAll() {
        return _MunicipioService.ListarMunicipios();
    }

    @PostMapping("/guardar")
    public Municipio Guardar(@RequestBody Municipio municipio) {
        return _MunicipioService.GuardarMunicipio(municipio);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Municipio> DeleteMunicipio(@PathVariable("id") Long id) {
        boolean eliminado = _MunicipioService.BorrarMunicipio(id);
        if (eliminado) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.internalServerError().build();
        }
    }
}
