package dio.edu.taskmanager.domain;

/*
 * A enumeração TaskStatus representa os possíveis estados de uma tarefa no sistema de
 * gerenciamento de tarefas. Cada tarefa pode estar em um dos seguintes estados:
 *
 * - PENDING: A tarefa está pendente e ainda não foi iniciada.
 * - IN_PROGRESS: A tarefa está em andamento e está sendo trabalhada.
 * - COMPLETED: A tarefa foi concluída com sucesso.
 */
public enum TaskStatus {

    PENDING,
    IN_PROGRESS,
    COMPLETED
}
