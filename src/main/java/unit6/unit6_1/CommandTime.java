package unit6.unit6_1;

import java.time.LocalTime;

/**
 * Команда вывода времени
 */
@CommandInfo(name = "time", description = "- вывод текущего времени")
public class CommandTime implements Command {
    /**
     * Выводит текущее время
     */
    @Override
    public void exec(String[] args) {
        System.out.println(LocalTime.now());
    }
}
