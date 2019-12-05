package be.intecbrussel.model.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String email;
    private String street;
    private int houseNumber;
    private String city;
    private int zipCode;

    public Author(@NotNull String username, @NotNull String password, @NotNull String firstName, @NotNull String lastName, @NotNull String email, String street, int houseNumber, String city, int zipCode) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.zipCode = zipCode;
    }

    private void editProfile(){

    }

    private void deleteProfile(){

    }
}
