package lesson_and_Homework_2.data;

import java.util.Iterator;

public class GroupStreamIterator implements Iterator {
    private GroupStream groupStream;
    private Iterator<StudentGroup> students;

    public GroupStreamIterator(GroupStream groupStream) {
        this.students = groupStream.getStudentGroupList().iterator();
    }

    @Override
    public boolean hasNext() {
        return this.students.hasNext();
    }

    @Override
    public Object next() {
        return this.students.next();
    }

    @Override
    public void remove() {
        this.students.remove();
    }

}