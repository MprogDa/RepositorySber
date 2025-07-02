package unit6.unit6_1;

import java.time.LocalDate;

/**
 * Команда вывода даты.
 */
@CommandInfo(name = "date", description = "- вывод текущей даты")
public class CommandDate implements Command {

    /**
     * Выводит текущую дату
     */
    @Override
    public void exec(String[] args) {
        System.out.println(LocalDate.now());
    }
}
