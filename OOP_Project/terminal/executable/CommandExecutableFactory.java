package OOP_Project.terminal.executable;

import OOP_Project.data.Student;
import OOP_Project.service.StudentService;

public class CommandExecutableFactory {

    StudentService studentService;

    public CommandExecutable create(String[] input) {
        if (input[0].equals("/add")) {
            return new CreateStudentExecutable(studentService, new Student(input[1]));
        } else if (input[0].equals("/delete")) {
            return new DeleteStudentExecutable(studentService, new Student(input[1]));
        } else if (input[0].equals("/deleteFio")) {
            return new DeleteStudentExecutableFio(studentService, new Student(input[1]));
        } else if (input[0].equals("/deleteNumberAge")) {
            return new DeleteStudentExecutableNumberAndAge(studentService, new Student(input[1]));
        } else {
            return null;
        }

    }
}
