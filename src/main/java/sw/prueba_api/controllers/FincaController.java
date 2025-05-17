package sw.prueba_api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sw.prueba_api.models.Finca;
import sw.prueba_api.servicies.FincaService;

@RestController
@RequestMapping("/api/finca")
public class FincaController {

    @Autowired
    FincaService _FincaService;

    @GetMapping("/")
    public ArrayList<Finca> GetAll(){
        return _FincaService.ListarFincas();
    }
    @PostMapping("/guardar")
    public Finca Guardar(@RequestBody Finca f){
        return _FincaService.GuardarFinca(f);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Finca>DeleteFinca(@PathVariable("id") Long id){
        boolean rs = _FincaService.BorrarFinca(id);
        if(rs){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.internalServerError().build();
        }
    }
}
