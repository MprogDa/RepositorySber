package unit6.unit6_1;
import java.io.File;

/**
 * Команда изменения текущей директории.
 */
@CommandInfo(name = "cd", description = "- смена текущей рабочей директории")
public class CommandCd implements Command {

    /**
     * Метод изменения текущей директории
     * @param args - путь к директории
     */
    @Override
    public void exec(String[] args) throws CommandExecutionException {
        if (args.length == 0) {
            throw new CommandExecutionException("cd", "не указана директория");
        }

        File dir = new File(args[0]);

        if (!dir.isDirectory()) {
            throw new CommandExecutionException("cd", "директория не существует");
        }

        System.setProperty("user.dir", dir.getAbsolutePath());
    }
}
