package OOP_Project.terminal.executable;

import OOP_Project.terminal.Command;

public interface CommandExecutableFactory {

    CommandExecutable create(Command command);
    
}
