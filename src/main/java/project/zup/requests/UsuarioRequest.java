package project.zup.requests;

import project.zup.domain.Usuario;

import java.time.LocalDate;

public class UsuarioRequest {
    private String name;
    private String email;
    private String cpf;
    private LocalDate nascimento;
    private VacinaRequest vacina;

    public UsuarioRequest() {
    }

    public UsuarioRequest(Usuario usuario) {
        this.name = usuario.getName();
        this.email = usuario.getEmail();
        this.cpf = usuario.getCpf();
        this.nascimento = usuario.getNascimento();
    }

    public UsuarioRequest(String name, String email, String cpf, LocalDate nascimento, VacinaRequest vacina) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.vacina = vacina;
    }

//    public UsuarioPostRequestBody(String name, String email, String cpf, LocalDate nascimento) {
//        this.name = name;
//        this.email = email;
//        this.cpf = cpf;
//        this.nascimento = nascimento;
//    }



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
