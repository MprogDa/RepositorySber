package unit6.unit6_1;

import java.io.*;

/**
 * Команда вывода содержимого директории
 */
@CommandInfo(name = "ls", description = "- вывод содержимого текущей директории")
public class CommandLs implements Command {

    /**
     * Выводит содержимое директории
     */
    @Override
    public void exec(String[] args) {
        File dir = new File(System.getProperty("user.dir"));
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
