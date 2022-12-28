package OOP_Project.service;

import static OOP_Project.utils.ReaderFromTxt.getStudentsFromTxt;
import static OOP_Project.utils.ReaderFromTxt.getTeacherFromTxt;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import OOP_Project.data.Student;
import OOP_Project.data.StudentGroup;
import OOP_Project.data.Teacher;
import OOP_Project.repository.Repository;

public class StudentGroupServiceImpl implements StudentGroupService {
    private final Repository<StudentGroup, Integer> repository;

    public StudentGroupServiceImpl(Repository<StudentGroup, Integer> repository) {
        this.repository = repository;
    }

    @Override
    public StudentGroup getGroup() {
        Teacher teacher = getTeacherFromTxt();
        List<Student> studentList = getStudentsFromTxt();
        return new StudentGroup(teacher, studentList);
    }

    @Override
    public StudentGroup getGroup(int number) {
        Teacher teacher = getTeacherFromTxt();
        List<Student> studentList = getStudentsFromTxt();
        return new StudentGroup(teacher, studentList, number);
    }

    @Override
    public void removeStudent(String firstName, String lastName) {
        Iterator<Student> students = getStudentsFromTxt().iterator();

        while (students.hasNext()) {
            Student student = students.next();
            if (firstName.equals(student.getFirstName()) && lastName.equals(student.getLastName())) {
                students.remove();
            }
        }

    }

    public void sortStudents(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList());
    }

    public StudentGroup saveGroup(StudentGroup studentGroup) {
        return repository.save(studentGroup);
    }

    public StudentGroup findGroup(int groupNumber) {
        return repository.findById(groupNumber);
    }
}
