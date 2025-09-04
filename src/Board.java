import java.util.ArrayList;
import java.util.List;

/**
 * Representa um quadro de tarefas com operações para gerenciamento
 * de atividades organizadas, podendo adicionar novas tarefas, move-las e apresenta-las
 *
 * @author Eduardo
 * @version 1.0
 */
public class Board {
    private List<Task> tarefas;
    private int contadorId;

    /**
     * Criação do metodo construtor iniciando o contador de ID em 1
     */
    public Board() {
        this.tarefas = new ArrayList<>();
        this.contadorId = 1;
    }

    /**
     * Cria uma tarefa ao status "TO DO"
     *
     * @param  titulo Titulo da tarefas (não pode ser nulo)
     * @param  descricao Descrição da tarefa (opcional)
     * @return nova tarefa
     */
    public Task adicionarTarefa(String titulo, String descricao) {
        Task t = new Task(contadorId++, titulo, descricao);
        tarefas.add(t);
        return t;
    }

    /**
     * Move a tarefa para outro status
     * @param id ID da tarefa que será movida
     * @param novoStatus O novo status adquirido pela tarefa
     * @return tarefa no novo status
     */
    public boolean moverTarefa(int id, String novoStatus) {
        for (Task t : tarefas) {
            if (t.getId() == id) {
                t.setStatus(novoStatus);
                return true;
            }
        }
        return false;
    }

    /**
     * Lista as tarefas
     * Apresenta uma lista das tarefas separadas pelos status
     */
    public void listarTarefas() {
        System.out.println("=== TO DO ===");
        tarefas.stream().filter(t -> t.getStatus().equals("TO DO")).forEach(System.out::println);

        System.out.println("=== DOING ===");
        tarefas.stream().filter(t -> t.getStatus().equals("DOING")).forEach(System.out::println);

        System.out.println("=== DONE ===");
        tarefas.stream().filter(t -> t.getStatus().equals("DONE")).forEach(System.out::println);
    }
}