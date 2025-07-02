package unit6.unit6_1;

/**
 * Команда вывода текущей директории
 */
@CommandInfo(name = "pwd", description = "- вывод текущей рабочей директории")
public class CommandPwd implements Command  {

    /**
     * Выводит текущую рабочую директорию
     */
    @Override
    public void exec(String[] args) {
        System.out.println(System.getProperty("user.dir"));
    }
}
