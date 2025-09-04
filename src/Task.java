/**
 * Representa uma tarefa no sistema de gerenciamento
 *
 * @author Eduardo
 * @version 1.0
 * @see Board
 */
public class Task {
    private int id;
    private String titulo;
    private String descricao;
    private String status;

    /**
     * Construtor que cria uma nova tarefa com status "TO DO".
     *
     * @param id Identificador da tarefa
     * @param titulo Título da tarefa (não pode ser nulo)
     * @param descricao Descrição da tarefa (opcional)
     */
    public Task(int id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = "TO DO";
    }

    /**
     * Retorna o ID da tarefa
     * @return ID da tarefa
     */
    public int getId() {
        return id;
    }

    /**
     * Retorna o Status da tarefa
     * @return status da tarefa
     */
    public String getStatus() {
        return status;
    }

    /**
     * Retorna a descrição da tarefa
     * @return descrição da tarefa
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define um novo status à tarefa
     * @param novoStatus o status que a tarefa deve pertencer
     */
    public void setStatus(String novoStatus) {
        this.status = novoStatus;
    }

    /**
     * Retorna um representação da tarefa
     * @return String representando a tarefa com o seu ID, nome e status
     */
    @Override
    public String toString() {
        return "[" + id + "] " + titulo + " (" + status + ")";
    }
}
