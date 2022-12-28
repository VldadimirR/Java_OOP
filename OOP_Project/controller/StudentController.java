package OOP_Project.controller;

import OOP_Project.data.Student;
import OOP_Project.service.StudentService;

public class StudentController implements GeneralizedController<Student, Integer> {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student save(Student entity) {
        return studentService.save(entity);
    }

    @Override
    public Student findById(Integer id) {
        return studentService.findById(id);
    }

}
