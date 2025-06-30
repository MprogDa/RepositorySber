package unit4;

public class Commandhelp extends Command{
    Command[] c;

    public Commandhelp(Command[] c){
        setName("help");
        setDescr(" - выводит список доступных команд");
        this.c = c;
    }

    @Override
    public boolean commandPass() {
        System.out.println("Доступные команды:");
        for(Command i : c){
            System.out.println('\t'+ i.getName() + i.getDescr());
        }
        return false;
    }
}
