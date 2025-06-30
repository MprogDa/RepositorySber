package unit4;

public class CommandExit extends Command {
    public CommandExit(){
        setName("exit");
        setDescr(" - завершает работу приложения");
    }

    @Override
    public boolean commandPass() {
        return true;
    }
}
