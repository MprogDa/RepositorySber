package unit4;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CommandTime extends Command {

    public CommandTime(){
        setName("time");
        setDescr(" - выводит текущее время");
    }

    @Override
    public boolean commandPass() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(LocalTime.now().format(formatter));
        return false;
    }
}
