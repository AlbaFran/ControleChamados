package controlechamados;

import java.time.LocalDateTime;

public class Atendimento {

    private Long id;
    private LocalDateTime dataHora;
    private String descricao;
    private Tecnico realizadoPor;

    public Atendimento(Long id, String descricao, Tecnico realizadoPor) {
        this.id = id;
        this.dataHora = LocalDateTime.now();
        this.descricao = descricao;
        this.realizadoPor = realizadoPor;
    }

    public void registrar() {
        this.dataHora = LocalDateTime.now();
    }
}
