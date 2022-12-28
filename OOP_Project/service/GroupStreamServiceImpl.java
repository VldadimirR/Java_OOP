package OOP_Project.service;

import java.util.Collections;
import java.util.List;

import OOP_Project.data.GroupStream;
import OOP_Project.data.comparators.GroupStreamComparator;

public class GroupStreamServiceImpl implements GroupStreamService {

    @Override
    public void streamSort(List<GroupStream> groupStream) {
        Collections.sort(groupStream, new GroupStreamComparator());
    }

    

}
