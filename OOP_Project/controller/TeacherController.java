package OOP_Project.controller;

import OOP_Project.data.Teacher;
import OOP_Project.service.TeacherService;

public class TeacherController implements GeneralizedController<Teacher, Integer> {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public Teacher save(Teacher entity) {
        return teacherService.save(entity);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherService.findById(id);
    }

}
