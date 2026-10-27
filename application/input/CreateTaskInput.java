package dio.edu.taskmanager.application.input;

import java.util.Optional;

/**
 * Um registro que representa a entrada para a criação de uma nova tarefa.
 */
public record CreateTaskInput (
        String title,
        Optional<String>description) {}
