package OOP_Project.data;

public abstract class User {
    private String firstName;
    private  String lastName;
    private int id;
    private String fio;

    public User(String fio){
        this.fio = fio;
    }

    public User(String firstName, String lastName, int id, String fio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.fio = fio;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }
}