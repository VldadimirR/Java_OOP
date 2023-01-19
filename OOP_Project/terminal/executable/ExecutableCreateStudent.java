package OOP_Project.terminal.executable;

import OOP_Project.data.Student;
import OOP_Project.service.StudentService;

public class ExecutableCreateStudent implements CommandExecutable {

    private StudentService studentService;
    private Student student;

    public ExecutableCreateStudent(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.save(student);

    }

}
