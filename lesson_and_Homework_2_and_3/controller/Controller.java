package lesson_and_Homework_2.controller;


import java.util.List;

import lesson_and_Homework_2.data.GroupStream;
import lesson_and_Homework_2.data.Student;
import lesson_and_Homework_2.data.StudentGroup;
import lesson_and_Homework_2.data.Teacher;
import lesson_and_Homework_2.service.DataService;
import lesson_and_Homework_2.service.GroupStreamServiceImpl;
import lesson_and_Homework_2.service.StudentGroupServiceImpl;
import lesson_and_Homework_2.service.StudentServiceImpl;
import lesson_and_Homework_2.service.TeacherDataService;

public class Controller {
    private DataService studentService;
    private DataService teacherService;
    private StudentGroupServiceImpl studentGroupService;
    private GroupStreamServiceImpl groupStreamService;

    public Controller(StudentServiceImpl studentService, TeacherDataService teacherService, GroupStreamServiceImpl groupStreamService,
                    StudentGroupServiceImpl studentGroupService){
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.groupStreamService = groupStreamService;
        this.studentGroupService = studentGroupService;
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

    public void removeStudent(String fio, StudentGroup studentGroup){
        studentGroupService.removeStudent(fio, studentGroup);
    }

    public void sortStudent(StudentGroup studentGroup){
        studentGroupService.sortStudent(studentGroup);
    }

    public void sortGroupStream(List<GroupStream> studentGroupList){
        groupStreamService.sortGroupStream(studentGroupList);
    }
}
