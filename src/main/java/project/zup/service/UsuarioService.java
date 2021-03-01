package project.zup.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import project.zup.domain.Usuario;
import project.zup.repository.UsuarioRepository;
import project.zup.requests.UsuarioRequest;
import project.zup.requests.UsuarioPutRequestBody;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listAll(){
        return usuarioRepository.findAll();
    }

    public Usuario findByIdOrThrowBadRequestException(long id){
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuario não encontrado"));
    }

    public Usuario findByEmail(String email){
        return usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuario não encontrado"));
    }

    public Usuario save(UsuarioRequest usuarioRequest) {
        return usuarioRepository.save(new Usuario(usuarioRequest));
    }

    public void delete(long id) {
        usuarioRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(UsuarioPutRequestBody usuarioPutRequestBody) {
        Usuario savedUsuario = findByIdOrThrowBadRequestException(usuarioPutRequestBody.getId());
        Usuario usuario = new Usuario(savedUsuario, usuarioPutRequestBody);
        usuarioRepository.save(usuario);
    }
}
