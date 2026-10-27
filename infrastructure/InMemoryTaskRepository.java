package dio.edu.taskmanager.infrastructure;

import dio.edu.taskmanager.domain.Task;
import dio.edu.taskmanager.domain.TaskId;
import dio.edu.taskmanager.domain.TaskRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
/*
 * A classe InMemoryTaskRepository é uma implementação da interface TaskRepository que armazena as tarefas
 * em memória usando um HashMap.
 */
public class InMemoryTaskRepository implements TaskRepository {

    /*
     * O HashMap: é usado para armazenar as tarefas, onde a chave é o TaskId e o valor é a própria Task.
     * Isso permite que as tarefas sejam rapidamente acessadas, adicionadas e removidas com base em seus
     * identificadores.
     */
    private final Map<TaskId, Task> storage = new HashMap<>();

    /*
     * Salva uma tarefa no repositório em memória.
     * @param task A tarefa a ser salva.
     * @return A tarefa salva.
     */
    @Override
    public Task save(Task task) {
        storage.put(task.getId(), task);
        return task;
    }

    /*
     * Retorna uma lista com todas as tarefas no repositório em memória.
     * @return Uma lista de todas as tarefas.
     */
    @Override
    public List<Task> findAll() {
        return new ArrayList<>(storage.values());
    }

    /*
     * Retorna uma tarefa com base no seu identificador (TaskId).
     * @param id O identificador da tarefa a ser buscada.
     * @return Um Optional contendo a tarefa encontrada, ou vazio se não houver nenhuma tarefa com o ID fornecido.
     */
    @Override
    public Optional<Task> findById(Task id) {
        return Optional.ofNullable(storage.get(id));
    }

    /*
     * Deleta uma tarefa com base no seu identificador (TaskId).
     * @param id O identificador da tarefa a ser deletada.
     */
    @Override
    public void delete(Task id) {
        storage.remove(id);
    }
}
