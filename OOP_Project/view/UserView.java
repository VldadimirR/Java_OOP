package OOP_Project.view;

import java.util.List;

import OOP_Project.data.User;

public abstract class UserView {

    protected abstract User findTheBest(List<User> userList);

    void showTheBest(List<User> userList){
        User user = findTheBest(userList);
        System.out.println(user);
    }
}
