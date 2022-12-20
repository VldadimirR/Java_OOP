package lesson_and_Homework_2.service;

import lesson_and_Homework_2.data.Student;
import lesson_and_Homework_2.data.StudentGroup;
import lesson_and_Homework_2.data.Teacher;
import lesson_and_Homework_2.util.ReaderFromTxt;

public class StudentGroupServiceImpl implements StudentGroupService {
    private StudentGroup studentGroup;

    public StudentGroupServiceImpl(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }
    
    public StudentGroup getGroup() {
        return studentGroup;
    }

    public void setGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }
    
    @Override
    public Student read(Student student){
        return (Student) ReaderFromTxt.read(student);
    }
    
    @Override
    public Teacher read(Teacher teacher) {
        return (Teacher)ReaderFromTxt.read(teacher);
    }
}
