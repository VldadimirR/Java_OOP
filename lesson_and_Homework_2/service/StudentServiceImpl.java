package lesson_and_Homework_2.service;

import lesson_and_Homework_2.data.User;
import lesson_and_Homework_2.util.ReaderFromTxt;
import lesson_and_Homework_2.util.WriterToTxt;

public class StudentServiceImpl implements DataService{
    
    @Override
    public void create(User user){
        WriterToTxt.write(user);;
    }
    
    @Override
    public User read(User user){
        return ReaderFromTxt.read(user);
    }
}
