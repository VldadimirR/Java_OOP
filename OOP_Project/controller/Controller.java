package OOP_Project.controller;

import java.util.List;

import OOP_Project.data.GroupStream;
import OOP_Project.data.StudentGroup;
import OOP_Project.data.User;
import OOP_Project.service.DataService;
import OOP_Project.service.GroupStreamService;
import OOP_Project.service.StudentGroupService;

public class Controller {
    private final DataService<User> groupService;
    private final GroupStreamService groupStreamService;
    private final StudentGroupService studentGroupService;

    public Controller(DataService<User> groupService, GroupStreamService groupStreamService,
            StudentGroupService studentGroupService) {
        this.groupService = groupService;
        this.groupStreamService = groupStreamService;
        this.studentGroupService = studentGroupService;
    }

    public User createGroup(int groupNumber) {
        return groupService.getGroup(groupNumber);
    }

    public void streamListSort(List<GroupStream> groupStream) {
        groupStreamService.streamSort(groupStream);
    }

    public void removeStudent(String firstName, String lastName) {
        studentGroupService.removeStudent(firstName, lastName);
    }

    public void sortStudents(StudentGroup studentGroup) {
        studentGroupService.sortStudents(studentGroup);
    }
}
