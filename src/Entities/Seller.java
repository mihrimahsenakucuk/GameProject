package Entities;

import java.time.LocalDate;

public class Seller extends Customer{

    private String number;

    public Seller(String id, String email, String firstName, String lastName, LocalDate dateOfBirth, String s, String nationlityId) {
        super(id, email, firstName, lastName, dateOfBirth, nationlityId);
        this.number= number;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
