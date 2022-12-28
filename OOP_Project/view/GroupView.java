package OOP_Project.view;

import java.util.List;

import OOP_Project.data.StudentGroup;
import OOP_Project.data.User;

public abstract class GroupView {
        public void showTheBest(List<StudentGroup> studentGroup) {
            System.out.println(findGroup(studentGroup));
        }
    
        public abstract User findGroup(List<StudentGroup> studentGroup);
    }

