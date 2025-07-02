package unit6.unit6_1;

public class CommandExecutionException extends Exception {
    private String commandName;

    public CommandExecutionException(String commandName, String message) {
        super(message);
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }
}
