package com.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;



public class EmployeeTest {

    @Test
    public void testValidEmployeeCreation() {
        Employee employee = new Employee("John", "Doe", 27560001);
        assertNotNull(employee);
        assertEquals("John", employee.firstName);
        assertEquals("Doe", employee.lastName);
        assertEquals("john.doe@mail.com", employee.email);
        assertEquals(27560001, employee.number);
    }

    @Test
    public void testInvalidEmployeeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee("John", "Doe", 27570000); // Invalid employee number
        });

        assertEquals("Employee number must be between 27560000 and 27569999", exception.getMessage());
    }

    @Test
    public void testNullFirstName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(null, "Doe", 27560001); // Null first name
        });

        assertEquals("First name cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testEmptyLastName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee("John", "", 27560001); // Empty last name
        });

        assertEquals("Last name cannot be null or empty", exception.getMessage());
    }
}
