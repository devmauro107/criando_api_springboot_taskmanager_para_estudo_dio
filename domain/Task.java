package dio.edu.taskmanager.domain;

import org.springframework.util.Assert;
import java.util.Optional;

/*
 * A classe Task representa uma tarefa no sistema de gerenciamento de tarefas.
 * Cada tarefa possui um identificador único (TaskId), um título, uma descrição opcional
 * e um status que indica o estado atual da tarefa (PENDING, IN_PROGRESS ou COMPLETED).
 */
public class Task {

    /*
     * A classe Task representa uma tarefa no sistema de gerenciamento de tarefas.
     * Cada tarefa possui um identificador único (TaskId), um título, uma descrição opcional
     * e um status que indica o estado atual da tarefa (PENDING, IN_PROGRESS ou COMPLETED).
     */
    private TaskId id;
    private String title;
    /*
     * A descrição da tarefa é opcional, então usamos Optional<String> para representá-la.
     * Isso permite que a descrição seja nula ou ausente, caso o usuário não queira
     * fornecer uma descrição para a tarefa.
     */
    private Optional<String> description;
    private TaskStatus status;

    /*
     * Construtor da classe Task que recebe o título e a descrição da tarefa como parâmetros.
     * O Assert.notNull é usado para garantir que o título não seja nulo.
     */
    public Task(String title, Optional<String> description) {
        Assert.notNull(title, "O título não pode ser nulo");

        /*
         * Ideia de criar um id único para cada tarefa,
         * utilizando a classe TaskId que gera um UUID aleatório.
         */
        this.id = new TaskId();
        this.title = title;
        this.description = description;
        /*
         * Inicializa o status da tarefa como PENDING (pendente).
         * Isso significa que a tarefa ainda não foi iniciada.
         */
        this.status = TaskStatus.PENDING;
    }
}
