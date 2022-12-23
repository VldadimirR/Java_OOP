package lesson_and_Homework_2.data;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator {
    
    private StudentGroup studentGroup;
    private Iterator<Student> students;
    // private List<Student> students;
    // private int cursor;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.students = studentGroup.getStudentList().iterator();
        // this.students = studentGroup.getStudentList();
    }
    

    @Override
    public boolean hasNext() {
        // return cursor < students.size();
        return this.students.hasNext();

    }

    @Override
    public Object next() {
        return this.students.next();
        // return students.get(cursor++);

    }

    @Override
    public void remove() {
        // this.students.remove(cursor);
        this.students.remove();
    }

}
