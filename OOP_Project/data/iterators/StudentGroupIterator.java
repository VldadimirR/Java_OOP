package OOP_Project.data.iterators;

import java.util.Iterator;
import java.util.List;

import OOP_Project.data.Student;
import OOP_Project.data.StudentGroup;

public class StudentGroupIterator implements Iterator<Student> {
    private List<Student> students;
    private int cursor;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.students = studentGroup.getStudentList();
    }

    @Override
    public boolean hasNext() {
        return cursor < students.size();

    }

    @Override
    public Student next() {
        return students.get(cursor++);

    }

    @Override
    public void remove() {
        this.students.remove(cursor);

    }

}
