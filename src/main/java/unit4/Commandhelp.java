package unit4;

public class Commandhelp extends Command{
    public Commandhelp(){
        setName("help");
        setDescr(" - выводит список доступных команд");
    }

    public static void commandPassHelp(Command[] c) {
        System.out.println("Доступные команды:");
        for(Command i : c){
            System.out.println('\t'+ i.getName() + i.getDescr());
        }
    }
}
