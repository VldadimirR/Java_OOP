package OOP_Project.controller;

import OOP_Project.data.StudentGroup;
import OOP_Project.service.StudentGroupServiceImpl;

public class StudentGroupController implements GeneralizedController<StudentGroup, Integer> {
    private final StudentGroupServiceImpl groupServiceImpl;

    public StudentGroupController(StudentGroupServiceImpl groupServiceImpl) {
        this.groupServiceImpl = groupServiceImpl;
    }

    @Override
    public StudentGroup save(StudentGroup entity) {
        return groupServiceImpl.saveGroup(entity);
    }

    @Override
    public StudentGroup findById(Integer id) {
        return groupServiceImpl.findGroup(id);
    }

}
