package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String firstName;
    private String email;
    private String lastName;
    private String fullName;


    public User() {
        super();
    }

    public User(String id, String firstName, String email, String lastName, String fullName) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.lastName = lastName;
        this.fullName = fullName;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public User id(String id) {
        this.id = id;
        return this;
    }

    public User firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public User email(String email) {
        this.email = email;
        return this;
    }

    public User lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public User fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == this)
//            return true;
//        if (!(o instanceof User)) {
//            return false;
//        }
//        User user = (User) o;
//        return id == user.id && Objects.equals(firstName, user.firstName) && Objects.equals(email, user.email) && Objects.equals(lastName, user.lastName) && Objects.equals(fullName, user.fullName);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, firstName, email, lastName, fullName);
//    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", email='" + getEmail() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", fullName='" + getFullName() + "'" +
            "}";
    }
     
    
}