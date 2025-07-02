package unit6.unit6_1;


/**
 * Интерфейс для реализации команд shell
 */
public interface Command {
    void exec(String[] args) throws CommandExecutionException;
}


