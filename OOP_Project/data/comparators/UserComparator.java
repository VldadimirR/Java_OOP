package OOP_Project.data.comparators;

import java.util.Comparator;

import OOP_Project.data.Student;

public class UserComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return (student1.getLastName().compareTo(student2.getLastName()));

    }
}
