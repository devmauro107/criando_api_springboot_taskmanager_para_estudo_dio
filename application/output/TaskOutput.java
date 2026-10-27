package dio.edu.taskmanager.application.output;

import dio.edu.taskmanager.domain.Task;
import java.util.Optional;

/**
 * Um registro que representa o resultado de uma tarefa.
 */
public record TaskOutput(
        String id,
        String title,
        Optional<String> description,
        String status){

        /**
         * Cria uma instância de TaskOutput a partir de uma instância de Task.
         *
         * @param task A instância de Task a ser convertida.
         * @return Uma nova instância de TaskOutput com os dados da tarefa.
         */
        public static TaskOutput from(Task task) {
            return new TaskOutput(task.getId().id().toString(),
                    task.getTitle(),
                    task.getDescription(),
                    task.getStatus().name());
    }
}
