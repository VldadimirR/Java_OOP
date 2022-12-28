package OOP_Project.service;

import OOP_Project.data.User;

public interface DataService<E extends User> {

    E getGroup();

    E getGroup(int number);
}
