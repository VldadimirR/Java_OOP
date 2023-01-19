package OOP_Project.repository;

import OOP_Project.data.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {

    E findByFio(String fio);

    E removeByFio(String fio);
}
