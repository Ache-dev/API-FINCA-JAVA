package sw.prueba_api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import sw.prueba_api.models.Imagen;
import sw.prueba_api.servicies.ImagenService;

@RestController
@RequestMapping("/api/imagen")
public class ImagenController {

    @Autowired
    ImagenService _ImagenService;

    @GetMapping("")
    public ArrayList<Imagen> GetAll() {
        return _ImagenService.ListarImagenes();
    }

    @PostMapping("/guardar")
    public Imagen Guardar(@RequestBody Imagen imagen) {
        return _ImagenService.GuardarImagen(imagen);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Imagen> DeleteImagen(@PathVariable("id") Long id) {
        boolean eliminado = _ImagenService.BorrarImagen(id);
        if (eliminado) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.internalServerError().build();
        }
    }
}
