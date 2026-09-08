package controlechamados;

import java.time.LocalDate;

public class Tecnico extends Usuario {

    private String especialidade;
    private LocalDate dataCadastro;

    public Tecnico(Long id, String nome, String email, String telefone,
                   String especialidade, LocalDate dataCadastro) {

        super(id, nome, email, telefone);

        this.especialidade = especialidade;
        this.dataCadastro = dataCadastro;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
