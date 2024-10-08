package com.bootcamp;

public class Employee {
    String firstName;
    String lastName;
    String email;
    Integer number;

    public Employee(String firstName, String lastName, Integer number) {

        if (number < 27560000 || number > 27569999) {
            throw new IllegalArgumentException("Employee number must be between 27560000 and 27569999");
        }
       
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be null or empty");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.email = String.format("%s.%s@mail.com", this.firstName.toLowerCase(), this.lastName.toLowerCase());
    }

   
    @Override
    public String toString() {
        return String.format("Employee{firstName='%s', lastName='%s', email='%s', number=%d}",
                firstName, lastName, email, number);
    }
}
