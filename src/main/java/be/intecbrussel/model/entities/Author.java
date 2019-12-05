package be.intecbrussel.model.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Author {
    @Id
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

    public String getUsername() {
        return username;
    }

    public void cloneFrom(Author author){
        this.username = author.username;
        this.password = author.password;
        this.firstName = author.firstName;
        this.lastName = author.lastName;
        this.email = author.email;
        this.street = author.street;
        this.houseNumber = author.houseNumber;
        this.city = author.city;
        this.zipCode = author.zipCode;
    }

    private void editProfile(){

    }

    private void deleteProfile(){

    }
}
