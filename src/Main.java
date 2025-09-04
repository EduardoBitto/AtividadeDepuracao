import java.util.Scanner;

/**
 * Classe principal do programa
 * Permite ao usuário adicionar, mover e listar tarefas
 *
 * @author Eduardo
 * @version 1.0
 * @see Board
 * @see Task
 */
public class Main {
    /**
     * Metodo principal que inicia o programa e gerencia os fluxos do código
     * @param args Utiliza as respostas do usuário como parâmetro
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board board = new Board();

        /**
         * Exibe o menu de opções para o usuário.
         */
        while (true) {
            System.out.println("\n--- KANBAN SIMPLES ---");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Mover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha: ");
            int op = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (op) {
                /**
                 * Cria uma nova tarefa e chama o metodo "adicionarTarefa" da classe "board"
                 */
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    if (titulo.isEmpty()){
                        System.out.println("Erro: O título não pode estar vazio!");
                        break;
                    }
                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();
                    Task t = board.adicionarTarefa(titulo, descricao);
                    System.out.println("Tarefa adicionada: " + t);
                    break;
                /**
                 * Move um tarefa para outro status, utiliza o metodo "moverTarefa" da classe "board"
                 */
                case 2:
                    System.out.print("ID da tarefa: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo status (TO DO/DOING/DONE): ");
                    String status = sc.nextLine();
                    if (board.moverTarefa(id, status)) {
                        System.out.println("Tarefa movida!");
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                    break;
                /**
                 * Apresenta a lista de tarefas com o metedo "listarTarefas" da classe "board"
                 */
                case 3:
                    board.listarTarefas();
                    break;
                /**
                 * Finaliza o programa automaticamente
                 */
                case 4:
                    System.out.println("Saindo...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}