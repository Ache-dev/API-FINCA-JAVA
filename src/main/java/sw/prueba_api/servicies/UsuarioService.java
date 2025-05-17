package sw.prueba_api.servicies;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sw.prueba_api.models.Usuario;
import sw.prueba_api.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository _UsuarioRepository;

    public ArrayList<Usuario> ListarUsuarios() {
        return (ArrayList<Usuario>) _UsuarioRepository.findAll();
    }

    public Usuario GuardarUsuario(Usuario usuario) {
        return _UsuarioRepository.save(usuario);
    }

    public boolean BorrarUsuario(Long id) {
        try {
            _UsuarioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
