package OOP_Project.controller;

public interface GeneralizedController<E, I> {
    E save(E entity);

    E findById(I id);

}
