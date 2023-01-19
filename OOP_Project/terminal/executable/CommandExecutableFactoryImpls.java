package OOP_Project.terminal.executable;

import javax.management.NotCompliantMBeanException;

import OOP_Project.data.Student;
import OOP_Project.service.StudentService;
import OOP_Project.terminal.Command;

public class CommandExecutableFactoryImpls implements CommandExecutableFactory {

    StudentService studentService;

    public CommandExecutableFactoryImpls(StudentService studentService) {
        this.studentService = studentService;
    }

    public CommandExecutable create(Command input) {
        if (input.isCreateCommand()) {
            return new ExecutableCreateStudent(studentService, new Student(input.getFirstArgument()));
        } else if (input.isDeleteCommand()) {
            return new ExecutableDeleteStudent(studentService, new Student(input.getFirstArgument()));
        } else if (input.isDeleteCommandByFio()) {
            return new ExecutableDeleteStudentFio(studentService, new Student(input.getFirstArgument()));
        } else if (input.isDeleteCommandByNumberAge()) {
            return new ExecutableDeleteStudentNumberAndAge(studentService, new Student(input.getFirstArgument()));
        } else {
            return null;
        }

    }
}
