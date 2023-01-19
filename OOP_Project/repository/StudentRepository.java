package OOP_Project.repository;

import OOP_Project.data.Student;

public class StudentRepository implements UserRepository<Student, Integer> {

    @Override
    public Student save(Student entity) {

        return null;
    }

    @Override
    public Student findById(Integer id) {

        return null;
    }

    @Override
    public Student findByFio(String fio) {

        return null;
    }

    @Override
    public Student removeByFio(String fio) {
        return null;
    }
    

    
    public Student remove(Student entity) {
        return null;
    }

    public Student removeByGroupNumberAndAge(int groupNumber, int yearOfBirth){
        return null;
    }

    
    

}
