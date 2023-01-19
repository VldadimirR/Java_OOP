package OOP_Project.terminal;

import java.util.Scanner;
import OOP_Project.terminal.executable.CommandExecutableFactory;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;

    public static TerminalReader getInstance(CommandParser commandParser,
            CommandExecutableFactory commandExecutableFactory) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory);
        }
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
    }

    public void runReader() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String input = in.nextLine();
            Command command = commandParser.parseCommand(input);
            commandExecutableFactory.create(command);

        }
    }
}
