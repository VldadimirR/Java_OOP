package lesson_and_Homework_2.data;

public abstract class User {
    private String fio;
    private int  birthYear;
    private int passport;

    public User(){

    }

    public User(String fio, int  birthYear, int passport){
        this.fio = fio;
        this.birthYear = birthYear;
        this.passport = passport;
    }

    public String getFio(){
        return fio;
    }
    public void setFio(String fio){
        this.fio = fio;
    }
    public int getBirthYear(){
        return birthYear;
    }
    public void setBirthYear(int  birthYear){
        this.birthYear = birthYear;
    }
    public int getPassport(){
        return passport;
    }
    public void setPassport(int passport){
        this.passport = passport;
    }
}

