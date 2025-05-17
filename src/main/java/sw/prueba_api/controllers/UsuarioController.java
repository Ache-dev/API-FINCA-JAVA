package sw.prueba_api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import sw.prueba_api.models.Usuario;
import sw.prueba_api.servicies.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService _UsuarioService;

    @GetMapping("/")
    public ArrayList<Usuario> GetAll() {
        return _UsuarioService.ListarUsuarios();
    }

    @PostMapping("/guardar")
    public Usuario Guardar(@RequestBody Usuario usuario) {
        return _UsuarioService.GuardarUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> DeleteUsuario(@PathVariable("id") Long id) {
        boolean eliminado = _UsuarioService.BorrarUsuario(id);
        if (eliminado) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.internalServerError().build();
        }
    }
}
    