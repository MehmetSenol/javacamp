package odev4_2.Entities;

public class Gamer {
    private int id;
    private String firstName;
    private String lastName;
    private String nationaltyID;
    private String dateOfBirth;
    private String password;
    private String email;



    public Gamer(int id, String firstName, String lastName, String nationaltyID, String dateOfBirth, String password, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationaltyID = nationaltyID;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getnationaltyID() {
        return nationaltyID;
    }

    public void setnationaltyID(String nationaltyID) {
        this.nationaltyID = nationaltyID;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
