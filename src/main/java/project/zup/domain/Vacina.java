package project.zup.domain;

import org.springframework.format.annotation.DateTimeFormat;
import project.zup.requests.VacinaRequest;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Vacina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private LocalDate dataAplicacao;
    private String email;

    public Vacina(Long id, String name, LocalDate dataAplicacao, String email) {
        this.id = id;
        this.name = name;
        this.dataAplicacao = dataAplicacao;
        this.email = email;
    }

    public Vacina(VacinaRequest vacina) {
        this.name = vacina.getName();
        this.dataAplicacao = vacina.getDataAplicacao();
        this.email = vacina.getEmail();
    }

    public Vacina() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
