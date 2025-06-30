package unit4;

public class CommandPwd extends Command {
    public CommandPwd(){
        setName("pwd");
        setDescr(" - выводит текущий рабочий каталог");
    }

    @Override
    public boolean commandPass() {
        System.out.println(System.getProperty("user.dir"));
        return false;
    }
}
