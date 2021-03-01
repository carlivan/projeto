package project.zup.requests;

import project.zup.domain.Usuario;

import java.time.LocalDate;


public class UsuarioPutRequestBody {
    private Long id;
    private String name;
    private String email;
    private String cpf;
    private LocalDate nascimento;
    private VacinaRequest vacina;

    public UsuarioPutRequestBody() {
    }

    public UsuarioPutRequestBody(Long id, String name, String email, String cpf, LocalDate nascimento) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public UsuarioPutRequestBody(Usuario usuario) {
        this.id = usuario.getId();
        this.name = usuario.getName();
        this.email = usuario.getEmail();
        this.cpf = usuario.getCpf();
        this.nascimento = usuario.getNascimento();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public VacinaRequest getVacina() {
        return vacina;
    }

    public void setVacina(VacinaRequest vacina) {
        this.vacina = vacina;
    }
}
