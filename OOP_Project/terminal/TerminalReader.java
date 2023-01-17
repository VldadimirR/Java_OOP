package OOP_Project.terminal;

import java.util.Scanner;

import OOP_Project.terminal.executable.CommandExecutable;
import OOP_Project.terminal.executable.CommandExecutableFactory;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser;

    public static TerminalReader getInstance(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public void getI(int f) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String coand = in.nextLine();
            String[] cool = commandParser.parseCommand(coand);
            CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactory();
            CommandExecutable commandExecutable = commandExecutableFactory.create(cool);
            commandExecutable.execute();
        }
    }
}
