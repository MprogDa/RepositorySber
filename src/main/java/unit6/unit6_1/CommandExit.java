package unit6.unit6_1;

/**
 * Команда завершения аботы
 */
@CommandInfo(name = "exit", description = "- выход из Shell")
public class CommandExit implements Command {

    /**
     * Завершает работу
     */
    @Override
    public void exec(String[] args) {
        System.exit(0);
    }
}
