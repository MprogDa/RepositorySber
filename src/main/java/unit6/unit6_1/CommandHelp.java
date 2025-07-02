package unit6.unit6_1;

import java.util.*;

/**
 * Команда вывода списка команд
 */
@CommandInfo(name = "help", description = "- выводит список команд")
public class CommandHelp implements Command {
    private HashMap<String, Command> commands;

    /**
     * Конструктор команды help.
     * @param commands - список доступных команд
     */
    public CommandHelp(HashMap<String, Command> commands) {
        this.commands = commands;
    }

    /**
     * Выводит список команд
     */
    @Override
    public void exec(String[] args) {
        System.out.println("команды:");
        for (HashMap.Entry<String, Command> entry : commands.entrySet()) {
            CommandInfo info = entry.getValue().getClass().getAnnotation(CommandInfo.class);
            System.out.println(info.name() + " " + info.description());
        }
    }
}
