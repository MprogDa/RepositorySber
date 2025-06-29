package unit4;

import java.util.Scanner;

public class Unit4Main {
    public static void unit4Start(){
        Command[] commands = new Command[]{
                new CommandDate(),
                new CommandTime(),
                new CommandPwd(),
                new CommandExit(),
                new Commandhelp()
        };

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
                if(com.getName().equals("help")){
                    Commandhelp.commandPassHelp(commands);
                    continue;
                }
                if(com.getName().equals("exit")){
                    return;
                }
                com.commandPass();
            }
            else {
                System.out.printf("Ошибка: неизвестная команда '%s'\n", str);
            }


        }



    }
}
