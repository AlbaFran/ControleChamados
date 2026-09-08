package controlechamados;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Chamado {

    private Long id;
    private String titulo;
    private String descricao;
    private Prioridades prioridade;
    private statusChamados status;
    private LocalDateTime dataAbertura;
    private LocalDateTime dataEncerramento;

    private Cliente cliente;
    private Tecnico tecnico;

    private List<Atendimento> atendimentos;

    public Chamado(Long id, String titulo, String descricao,
                   Prioridades prioridade, Cliente cliente) {

        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.cliente = cliente;

        this.status = statusChamados.ABERTO;
        this.dataAbertura = LocalDateTime.now();
        this.dataEncerramento = null;

        this.tecnico = null;

        this.atendimentos = new ArrayList<>();
    }

    public void atribuirTecnico(Tecnico t) {

        if (status != statusChamados.ABERTO &&
            status != statusChamados.AGUARDANDO_CLIENTE) {

            throw new IllegalStateException(
                "O chamado não pode ser atribuído a um técnico neste status."
            );
        }

        this.tecnico = t;
    }

    public void alterarStatus(statusChamados s) {
        this.status = s;
    }

    public boolean estaAberto() {
        return status == statusChamados.ABERTO;
    }

    public void registrarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    public void encerrar() {

        if (atendimentos.isEmpty()) {
            throw new IllegalStateException(
                "Não é possível encerrar um chamado sem atendimento."
            );
        }

        this.status = statusChamados.ENCERRADO;
        this.dataEncerramento = LocalDateTime.now();
    }
}
