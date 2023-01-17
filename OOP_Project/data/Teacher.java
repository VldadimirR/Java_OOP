package OOP_Project.data;

public class Teacher extends User {
    private String rank;

    public Teacher(String firstName, String lastName, int id, String rank, String fio) {
        super(firstName, lastName, id, fio);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
