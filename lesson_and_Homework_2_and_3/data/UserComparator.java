package lesson_and_Homework_2.data;

import java.util.Comparator;

public class UserComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return (student1.getFio().compareTo(student2.getFio()));

    }
}
