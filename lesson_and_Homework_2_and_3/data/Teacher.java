package lesson_and_Homework_2.data;

public class Teacher extends User {
    private int department;

    public Teacher(int department, String fio, int birthYear, int passport) {
        super(fio, birthYear, passport);
        this.department = department;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
}
