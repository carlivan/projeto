package project.zup.service;

import org.springframework.stereotype.Service;
import project.zup.domain.Usuario;
import project.zup.domain.Vacina;
import project.zup.repository.VacinaRepository;;
import project.zup.requests.VacinaRequest;

import java.util.List;

@Service
public class VacinaService {

    private final UsuarioService usuarioService;

    private final VacinaRepository vacinaRepository;

    public VacinaService(UsuarioService usuarioService, VacinaRepository vacinaRepository) {
        this.usuarioService = usuarioService;
        this.vacinaRepository = vacinaRepository;
    }

    public List<Vacina> listAll(){
        return vacinaRepository.findAll();
    }

    public Vacina save(VacinaRequest vacinaRequest) {

        Usuario usuario = usuarioService.findByEmail(vacinaRequest.getEmail());

        return vacinaRepository.save(new Vacina(vacinaRequest));
     }
}
