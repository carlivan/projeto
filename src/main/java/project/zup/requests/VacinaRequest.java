package project.zup.requests;

import java.time.LocalDate;

public class VacinaRequest {
    private String name;
    private LocalDate dataAplicacao;
    private String email;

    public VacinaRequest() {
    }

    public VacinaRequest(String name, LocalDate dataAplicacao, String email) {
        this.name = name;
        this.dataAplicacao = dataAplicacao;
        this.email = email;
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
