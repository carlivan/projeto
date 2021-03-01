package project.zup.domain;

import com.sun.istack.NotNull;
import project.zup.requests.UsuarioRequest;
import project.zup.requests.UsuarioPutRequestBody;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @NotNull
    private String name;

    @NotNull
    @NotEmpty
    @Email
    @Column(name ="email", unique = true)
    private String email;

    @NotNull
    @NotEmpty
    //@CPF
    @Column(name ="cpf", unique = true)
    private String cpf;

    @NotNull
    private LocalDate nascimento;

    public Usuario() {
    }

   public Usuario(UsuarioRequest usuario) {
        this.name = usuario.getName();
        this.email = usuario.getEmail();
        this.cpf = usuario.getCpf();
        this.nascimento = usuario.getNascimento();
    }

    public Usuario(Usuario savedUsuario, UsuarioPutRequestBody usuarioPutRequestBody) {
        this.id = savedUsuario.getId();
        this.email = usuarioPutRequestBody.getEmail();
        this.cpf = usuarioPutRequestBody.getCpf();
        this.name = usuarioPutRequestBody.getName();
        this.nascimento = usuarioPutRequestBody.getNascimento();
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
}
