package unit4;

import java.time.LocalDate;

public class CommandDate extends Command{

    public CommandDate(){
        setName("date");
        setDescr(" - выводит текущее время");
    }

    @Override
    public boolean commandPass() {
        System.out.println(LocalDate.now());
        return false;
    }
}
