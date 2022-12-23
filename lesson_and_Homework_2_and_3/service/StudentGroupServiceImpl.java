package lesson_and_Homework_2.service;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import lesson_and_Homework_2.data.Student;
import lesson_and_Homework_2.data.StudentGroup;
import lesson_and_Homework_2.data.Teacher;
import lesson_and_Homework_2.data.UserComparator;
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
    public Student read(Student student) {
        return (Student) ReaderFromTxt.read(student);
    }

    @Override
    public Teacher read(Teacher teacher) {
        return (Teacher) ReaderFromTxt.read(teacher);
    }

    public void removeStudent(String fio, StudentGroup studentGroup) {
        Iterator<Student> studentGroupIterator = studentGroup.iterator();
        while (studentGroupIterator.hasNext()) {
            Student student = studentGroupIterator.next();
            if (fio.equals(student.getFio()))
                studentGroupIterator.remove();
        }
    }

    public void sortStudent(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList());
    }

    public void sortStudents(List<Student> studentList) {
        Collections.sort(studentList, new UserComparator());
    }
}
