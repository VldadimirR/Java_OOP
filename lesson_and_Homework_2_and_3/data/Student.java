package lesson_and_Homework_2.data;

public class Student extends User implements Comparable<Student> {
    private int groupNumber;

    public Student() {

    }

    public Student(int groupNumber, String fio, int birthYear, int passport) {
        super(fio, birthYear, passport);
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public int compareTo(Student student) {
        if (this.getBirthYear() > student.getBirthYear())
            return 1;
        else if (this.getBirthYear() < student.getBirthYear())
            return -1;
        else
            return 0;
        // return Integer.compare(this.getBirthYear(), student.getBirthYear());
    }

}
