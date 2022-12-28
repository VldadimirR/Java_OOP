package OOP_Project.service;

import OOP_Project.data.StudentGroup;

public interface StudentGroupService {

    StudentGroup getGroup(int number);

    StudentGroup getGroup();

    void removeStudent(String firstName, String lastName);

    void sortStudents(StudentGroup studentGroup);

}
