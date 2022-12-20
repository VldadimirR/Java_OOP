package lesson_and_Homework_2.controller;

import lesson_and_Homework_2.data.Student;
import lesson_and_Homework_2.data.StudentGroup;
import lesson_and_Homework_2.data.Teacher;
import lesson_and_Homework_2.service.DataService;
import lesson_and_Homework_2.service.StudentServiceImpl;
import lesson_and_Homework_2.service.TeacherDataService;

public class Controller {
    private DataService studentService;
    private DataService teacherService;

    public Controller(StudentServiceImpl studentService, TeacherDataService teacherService){
        this.studentService = studentService;
        this.teacherService = teacherService;
    }
 
    public Student createStudent(Student student){
        studentService.create(student);
        return (Student) studentService.read(student);
    }

    public Teacher createTeacher(Teacher teacher){
        studentService.create(teacher);
        return (Teacher) teacherService.read(teacher);
    }

    public StudentGroup createGroup(int groupNumber){
        StudentGroup studentGroup = new StudentGroup(null, null, groupNumber);
        return studentGroup;
    }
}
