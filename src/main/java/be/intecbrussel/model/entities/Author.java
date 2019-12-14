package be.intecbrussel.model.entities;

import be.intecbrussel.model.EntityInterface;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Author implements EntityInterface {
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

    public Author(String username, @NotNull String password, @NotNull String firstName, @NotNull String lastName, @NotNull String email) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Author setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Author setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Author setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Author setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Author setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Author setStreet(String street) {
        this.street = street;
        return this;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public Author setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Author setCity(String city) {
        this.city = city;
        return this;
    }

    public int getZipCode() {
        return zipCode;
    }

    public Author setZipCode(int zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public Author() {
    }


    public String getUsername() {
        return username;
    }

    // Copies all the attributes from an author object to this author object
    @Override
    public void cloneFrom(EntityInterface authorr){
        Author author = (Author) authorr;
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

    @Override
    public String toString() {
        return "\nAuthor{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                "}\n";
    }

    @Override
    public Object getId() {
        return username;
    }

}

