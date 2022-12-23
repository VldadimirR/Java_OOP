package lesson_and_Homework_2.data;

import java.util.Iterator;
import java.util.List;

public class GroupStream implements Iterable<StudentGroup>, Comparable<GroupStream> {
    private List<StudentGroup> studentGroupList;
    private int numberGroupStream;

    public GroupStream(List<StudentGroup> studentGroupList, int numberGroupStream) {
        this.studentGroupList = studentGroupList;
        this.numberGroupStream = numberGroupStream;
    }

    public int getNumberGroupStream() {
        return numberGroupStream;
    }

    public void setNumberGroupStream(int numberGroupStream) {
        this.numberGroupStream = numberGroupStream;
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

    @Override
    public int compareTo(GroupStream groupStream) {
        return Integer.compare(this.getNumberGroupStream(), groupStream.getNumberGroupStream());
    }

}
