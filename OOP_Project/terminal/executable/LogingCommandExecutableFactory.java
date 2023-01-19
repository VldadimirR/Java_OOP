package OOP_Project.terminal.executable;

import OOP_Project.service.StudentService;
import OOP_Project.terminal.Command;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpls {

    
    public LogingCommandExecutableFactory(StudentService studentService){
        super(studentService);
    }
    
    @Override
    public CommandExecutable create(Command input){
        System.out.println(input);
        CommandExecutable result = super.create(input);
        System.out.println("Bye");
        return result;
    }
}
