package dio.edu.taskmanager.application;

import dio.edu.taskmanager.application.input.CreateTaskInput;
import dio.edu.taskmanager.application.output.TaskOutput;
import dio.edu.taskmanager.domain.Task;
import dio.edu.taskmanager.domain.TaskRepository;
import org.springframework.stereotype.Service;

/**
 * Caso de uso para criar uma nova tarefa.
 */
@Service
public class CreateTaskUseCase {

    /**
     * O repositório de tarefas ou (Injeção de Dependência).
     * Mais comumente, é uma interface que define os métodos para persistir e recuperar tarefas.
     */
    private final TaskRepository Repository;

    /**
     * Construtor da classe CreateTaskUseCase.
     *
     * @param Repository O repositório de tarefas a ser utilizado.
     */
    public CreateTaskUseCase(TaskRepository Repository) {
        this.Repository = Repository;
    }

    /**
     * Executa o caso de uso para criar uma nova tarefa.
     *
     * @param input A entrada contendo os dados da nova tarefa.
     * @return O resultado da criação da tarefa, encapsulado em um TaskOutput.
     */
    public TaskOutput execute(CreateTaskInput input) {
        var task = new Task(input.title(), input.description());
        var saved = Repository.save(task);
        return TaskOutput.from(task);
    }
}
