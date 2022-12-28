package OOP_Project.repository;

public interface Repository<E, I> {

    E save(E entity);

    E findById(I id);
}
