package lesson_and_Homework_2.service;

import lesson_and_Homework_2.data.Student;
import lesson_and_Homework_2.data.Teacher;


public interface StudentGroupService  {
   
    Teacher read(Teacher teacher);

    Student read(Student student);
}
