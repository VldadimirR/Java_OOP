package OOP_Project.terminal.executable;

import OOP_Project.data.Student;
import OOP_Project.service.StudentService;

public class DeleteStudentExecutableNumberAndAge implements CommandExecutable {

    private StudentService studentService;
    private Student student;

    public DeleteStudentExecutableNumberAndAge(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.removeNumberAge(student.getGroupNumber(), student.getYearOfBirth());
    }

}
