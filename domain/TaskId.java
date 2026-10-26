package dio.edu.taskmanager.domain;

import org.springframework.util.Assert;
import java.util.UUID;

/*
 * A classe TaskId representa um identificador único para uma tarefa no sistema de
 * gerenciamento de tarefas. Ele encapsula um 'UUID' (Universally Unique Identifier)
 * que é gerado aleatoriamente para garantir a unicidade de cada tarefa.
 */
public record TaskId (UUID id) {

    /*
     * Construtor que recebe um UUID como parâmetro.
     * O Assert.notNull é usado para garantir que o UUID não seja nulo.
     *
     * Assert: é uma classe utilitária do Spring Framework que lança uma exceção IllegalArgumentException
     * se a condição fornecida for falsa. Neste caso, estamos verificando se o UUID fornecido não é nulo,
     * e se for nulo, uma mensagem de erro será lançada informando que "O ID não pode ser nulo".
     *
     * notNull: é um método estático da classe Assert que verifica se o objeto fornecido é nulo.
     */
    public TaskId {
        Assert.notNull(id, "O ID não pode ser nulo");
    }

    /*
     * Construtor padrão que gera um UUID aleatório para o TaskId.
     * Isso permite criar um TaskId sem precisar fornecer um UUID específico.
     */
    public TaskId() {
        this(UUID.randomUUID());
    }
}
