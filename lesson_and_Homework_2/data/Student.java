package lesson_and_Homework_2.data;

public class Student extends User {
    private int groupNumber;

    public Student(){

    }

    public Student(int groupNumber, String fio, int  birthYear, int passport){
        super(fio, birthYear, passport);
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber(){
        return groupNumber;
    }
    public void setGroupNumber(int groupNumber){
        this.groupNumber = groupNumber;
    }

    
}
