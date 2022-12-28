package OOP_Project.data;

import java.util.Iterator;
import java.util.List;

import OOP_Project.data.iterators.GroupStreamIterator;

public class GroupStream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroupList;

    public GroupStream(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupStreamIterator(this);
    }

}
