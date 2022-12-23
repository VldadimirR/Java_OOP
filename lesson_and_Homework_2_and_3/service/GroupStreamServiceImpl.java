package lesson_and_Homework_2.service;

import java.util.List;

import lesson_and_Homework_2.data.GroupStream;
import lesson_and_Homework_2.data.GroupStreamComparator;

public class GroupStreamServiceImpl {

    public void sortGroupStream(List<GroupStream> studentGroupList) {
        studentGroupList.sort(new GroupStreamComparator());
    }

}
