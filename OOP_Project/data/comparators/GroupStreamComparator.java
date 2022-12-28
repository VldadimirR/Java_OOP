package OOP_Project.data.comparators;

import java.util.Comparator;

import OOP_Project.data.GroupStream;

public class GroupStreamComparator implements Comparator<GroupStream> {

    @Override
    public int compare(GroupStream groupStream1, GroupStream groupStream2) {
        int o11 = groupStream1.getStudentGroupList().size();
        int o22 = groupStream2.getStudentGroupList().size();
        return Integer.compare(o11, o22);
    }

}
