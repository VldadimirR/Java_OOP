package OOP_Project.service;

import OOP_Project.data.Student;
import OOP_Project.repository.StudentRepository;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public Student findById(int passport) {
        return studentRepository.findById(passport);
    }

    public Student findByFio(String fio) {
        return studentRepository.findByFio(fio);
    }

    public Student remove(Student student) {
        return studentRepository.remove(student);
    }

    public Student removeByFio(String fio) {
        return studentRepository.removeByFio(fio);
    }

    public Student removeByGroupNumberAndAge(int groupNumber, int yearOfBirth){
        return studentRepository.removeByGroupNumberAndAge(groupNumber, yearOfBirth);
    }


}
