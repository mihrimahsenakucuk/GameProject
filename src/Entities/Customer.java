package Entities;

import java.time.LocalDate;

public class Customer {

    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String nationlityId;

    public Customer(String id,String email,String firstName,String lastName,LocalDate dateOfBirth,String nationlityId) {
        this.id=id;
        this.email=email;
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateOfBirth=dateOfBirth;
        this.nationlityId=nationlityId;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationlityId() {
        return nationlityId;
    }

    public void setNationlityId(String nationlityId) {
        this.nationlityId = nationlityId;
    }
}
