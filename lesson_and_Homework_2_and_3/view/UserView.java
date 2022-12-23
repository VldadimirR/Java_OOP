package lesson_and_Homework_2.view;

import java.util.List;

import lesson_and_Homework_2.data.User;

public abstract class UserView {

    protected abstract User findTheBest(List<User> userList);

    void showTheBest(List<User> userList){
        User user = findTheBest(userList);
        System.out.println(user);
    }
}
