package sw.prueba_api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import sw.prueba_api.models.TipoDocumento;
import sw.prueba_api.servicies.TipoDocumentoService;

@RestController
@RequestMapping("/api/tipodocumento")
public class TipoDocumentoController {

    @Autowired
    TipoDocumentoService _TipoDocumentoService;

    @GetMapping("")
    public ArrayList<TipoDocumento> GetAll() {
        return _TipoDocumentoService.ListarTipoDocumentos();
    }

    @PostMapping("/guardar")
    public TipoDocumento Guardar(@RequestBody TipoDocumento tipoDocumento) {
        return _TipoDocumentoService.GuardarTipoDocumento(tipoDocumento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TipoDocumento> DeleteTipoDocumento(@PathVariable("id") Long id) {
        boolean eliminado = _TipoDocumentoService.BorrarTipoDocumento(id);
        if (eliminado) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.internalServerError().build();
        }
    }
}
