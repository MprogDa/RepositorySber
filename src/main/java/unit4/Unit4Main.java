package unit4;

import java.util.Scanner;

public class Unit4Main {
    public static void unit4Start(){
        Command[] commands = new Command[]{
                new CommandDate(),
                new CommandTime(),
                new CommandPwd(),
                new CommandExit(),
                null
        };

        commands[commands.length-1] = new Commandhelp(commands);

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("> ");
            String str = scanner.nextLine().toLowerCase().trim();
            Command com = null;
            for (Command i : commands){
                if(i.getName().equals(str)){
                    com = i;
                    break;
                }
            }

            if(com != null){
                boolean end = com.commandPass();
                if(end) return;
            }
            else {
                System.out.printf("Ошибка: неизвестная команда '%s'\n", str);
            }

        }

    }
}
