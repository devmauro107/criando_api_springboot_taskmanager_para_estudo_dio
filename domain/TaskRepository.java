package dio.edu.taskmanager.domain;

import java.util.List;
import java.util.Optional;

/*
 * A interface TaskRepository define os métodos que serão implementados para
 * gerenciar as tarefas no sistema de gerenciamento de tarefas.
 * Ela fornece operações básicas de CRUD (Create, Read, Update, Delete) para as tarefas.
 */
public interface TaskRepository {

    /*
     * Salva uma tarefa no repositório.
     * @param task A tarefa a ser salva.
     * @return A tarefa salva.
     */
    Task save(Task task);
    /*
     * Retorna uma lista com todas as tarefas no repositório.
     * @return Uma lista de todas as tarefas.
     */
    List<Task> findAll();
    /*
     * Retorna uma tarefa com base no seu identificador (TaskId).
     * @param id O identificador da tarefa a ser buscada.
     * @return Um Optional contendo a tarefa encontrada, ou vazio se não houver nenhuma tarefa com o ID fornecido.
     */
    Optional<Task> findById(Task id);
    /*
     * Deleta uma tarefa com base no seu identificador (TaskId).
     * @param id O identificador da tarefa a ser deletada.
     */
    void delete(Task id);
}
