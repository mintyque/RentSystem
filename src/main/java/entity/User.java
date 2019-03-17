package entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class User {
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Size(max = 25)
    @Column(name = "FIRST_NAME")
    private String name;

    @Size(max = 25)
    @Column(name = "LAST_NAME")
    private String surname;

    @Size(max = 25)
    @Column(name = "PHONE")
    private String phoneNumber;

    @Size(max = 50)
    @Column(name = "EMAIL", unique = true)
    private String email;

    @Size(max = 25)
    @Column(name = "PASSWORD")
    private String password;

    public User(String name, String surname, String phoneNumber, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
