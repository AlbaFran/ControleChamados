package controlechamados;

import java.time.LocalDate;

public class ControleChamados {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("       CONTROLE DE CHAMADOS");
        System.out.println("========================================");


        // CRIANDO EQUIPE

        Equipe equipe = new Equipe(
                1L,
                "Suporte de TI",
                "Equipe responsável pelo suporte técnico"
        );


        // CRIANDO CLIENTE

        Cliente cliente = new Cliente(
                1L,
                "João da Silva",
                "joao@email.com",
                "(11) 99999-9999",
                "123.456.789-00",
                "Mogi das Cruzes - SP"
        );


        // CRIANDO TECNICO

        Tecnico tecnico = new Tecnico(
                1L,
                "Carlos Oliveira",
                "carlos@email.com",
                "(11) 98888-8888",
                "Infraestrutura",
                LocalDate.now()
        );


        // MOSTRANDO CLIENTE

        System.out.println("\n---------- CLIENTE ----------");
        System.out.println("ID: " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("E-mail: " + cliente.getEmail());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("CPF/CNPJ: " + cliente.getCpfCnpj());


        // MOSTRANDO TECNICO

        System.out.println("\n---------- TECNICO ----------");
        System.out.println("ID: " + tecnico.getId());
        System.out.println("Nome: " + tecnico.getNome());
        System.out.println("E-mail: " + tecnico.getEmail());
        System.out.println("Telefone: " + tecnico.getTelefone());
        System.out.println("Especialidade: " + tecnico.getEspecialidade());


        // MOSTRANDO EQUIPE

        System.out.println("\n---------- EQUIPE ----------");
        System.out.println("Equipe criada com sucesso.");
        System.out.println("ID: " + equipe.getId());


        // CRIANDO CHAMADO

        Chamado chamado = new Chamado(
                1L,
                "Computador não liga",
                "O computador do cliente não está ligando.",
                Prioridades.ALTA,
                cliente
        );


        // MOSTRANDO CHAMADO

        System.out.println("\n---------- CHAMADO ----------");
        System.out.println("ID: 1");
        System.out.println("Título: Computador não liga");
        System.out.println("Descrição: O computador do cliente não está ligando.");
        System.out.println("Prioridade: ALTA");
        System.out.println("Status: ABERTO");


        // VERIFICANDO STATUS

        System.out.println("\nChamado está aberto? "
                + chamado.estaAberto());


        // ATRIBUINDO TECNICO

        chamado.atribuirTecnico(tecnico);

        System.out.println("\nTécnico atribuído ao chamado:");
        System.out.println("Nome: " + tecnico.getNome());
        System.out.println("Especialidade: " + tecnico.getEspecialidade());


        // ALTERANDO STATUS

        chamado.alterarStatus(statusChamados.EM_ATENDIMENTO);

        System.out.println("\nStatus do chamado: EM_ATENDIMENTO");


        // CRIANDO ATENDIMENTO

        Atendimento atendimento = new Atendimento(
                1L,
                "Foi realizada uma análise no computador.",
                tecnico
        );


        // REGISTRANDO ATENDIMENTO

        chamado.registrarAtendimento(atendimento);

        System.out.println("\nAtendimento registrado com sucesso.");
        System.out.println("Técnico responsável: "
                + tecnico.getNome());


        // ENCERRANDO CHAMADO

        chamado.encerrar();

        System.out.println("\n---------- FINALIZAÇÃO ----------");
        System.out.println("Chamado encerrado com sucesso.");
        System.out.println("Status final: ENCERRADO");


        System.out.println("\n========================================");
        System.out.println("          FIM DO SISTEMA");
        System.out.println("========================================");
    }
}  
    
    

