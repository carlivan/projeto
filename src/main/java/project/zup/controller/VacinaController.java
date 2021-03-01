package project.zup.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.zup.domain.Vacina;
import project.zup.requests.VacinaRequest;
import project.zup.service.VacinaService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("vacinas")
public class VacinaController {
    private final VacinaService vacinaService;

    public VacinaController(VacinaService vacinaService) {
        this.vacinaService = vacinaService;
    }

    @GetMapping
    public ResponseEntity<List<Vacina>> list() {
        return ResponseEntity.ok(vacinaService.listAll());
    }

    @PostMapping
    public ResponseEntity<Vacina> save(@Valid @RequestBody VacinaRequest vacinaRequest){
        return new ResponseEntity<>(vacinaService.save(vacinaRequest), HttpStatus.CREATED);
    }
}
