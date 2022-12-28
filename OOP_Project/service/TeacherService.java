package OOP_Project.service;

import OOP_Project.data.Teacher;
import OOP_Project.repository.TeacherRepository;

public class TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher findById(int id) {
        return teacherRepository.findById(id);
    }
}
