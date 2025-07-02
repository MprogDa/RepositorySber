package unit6.unit6_1;

import java.io.*;
import java.util.*;


/**
 * Основной класс Shell для выполнения команд
 */
public class Shell {
    private final HashMap<String, Command> commands = new HashMap<>();
    private String packName = "unit6.unit6_1";
    private String path = "unit6/unit6_1";

    public Shell() {
        addCommand();
        startShell();
    }

    /**
     * Добавляет команды из пакета
     */
    private void addCommand() {
        try {
            File dir = new File(getClass().getClassLoader().getResource(path).getFile());
            for (File file : dir.listFiles()) {
                if (file.getName().endsWith(".class")) {
                    String classAdd = packName + "." + file.getName();
                    try {
                        Class<?> com = Class.forName(classAdd.replace(".class", ""));
                        if (Command.class.isAssignableFrom(com) && com != CommandHelp.class) {
                            CommandInfo info = com.getAnnotation(CommandInfo.class);
                            Command cAdd = (Command)(com.newInstance());
                            commands.put(info.name(), cAdd);
                        }
                    } catch (Exception e) {
                    }
                }
            }
        } catch (Exception e) {
        }
        commands.put("help", new CommandHelp(commands));
    }

    /**
     * Запускает Shell.
     */
    public void startShell() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("> ");
            String str = scanner.nextLine().trim();

            String[] comInput = str.split(" ");
            String cmdName = comInput[0];
            String[] args;
            if(comInput.length > 1){
                args = Arrays.copyOfRange(comInput, 1, comInput.length);
            }
            else {
                args = null;
            }
            Command com = commands.get(cmdName);
            if (com == null) {
                System.out.println("Неизвестная команда: " + cmdName);
            }
            else {
                try {
                    com.exec(args);
                }
                catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            }

        }
    }
}
