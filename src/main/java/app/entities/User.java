package app.entities;

public class User {
    private String name;
    private String surname;

    private String email;
    private String password;

    public User() {
    }

    public User(String name, String surname, String email, String password) {
        this.name = name;
        this.password = password;
        this.surname = surname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}