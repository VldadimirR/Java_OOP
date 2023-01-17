package OOP_Project.terminal.executable;

import OOP_Project.data.Student;
import OOP_Project.service.StudentService;

public class CreateStudentExecutable implements CommandExecutable {

    private StudentService studentService;
    private Student student;

    public CreateStudentExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.save(student);

    }

}
