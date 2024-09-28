package com.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LeaseCalculatorTest {

    @Test
    public void testCalculateMonthlyPayment() {
        // Test case 1: Normal values
        double totalLeasedMoney = 30000.0;
        double downPayment = 5000.0;
        int monthsLeaseTerm = 36;
        double interestRate = 5.0;

        double expectedMonthlyPayment = 729.17; // Corrected expected value
        double actualMonthlyPayment = LeaseCalculator.calculateMonthlyPayment(totalLeasedMoney, downPayment,
                monthsLeaseTerm, interestRate);
        assertEquals(expectedMonthlyPayment, actualMonthlyPayment, 0.01);

        // Test case 2: Zero down payment
        totalLeasedMoney = 30000.0;
        downPayment = 0.0;
        monthsLeaseTerm = 36;
        interestRate = 5.0;

        expectedMonthlyPayment = 875.00; // Calculated expected value
        actualMonthlyPayment = LeaseCalculator.calculateMonthlyPayment(totalLeasedMoney, downPayment, monthsLeaseTerm,
                interestRate);
        assertEquals(expectedMonthlyPayment, actualMonthlyPayment, 0.01);

        // Test case 3: No interest
        totalLeasedMoney = 30000.0;
        downPayment = 5000.0;
        monthsLeaseTerm = 36;
        interestRate = 0.0;

        expectedMonthlyPayment = 694.44; // Calculated expected value
        actualMonthlyPayment = LeaseCalculator.calculateMonthlyPayment(totalLeasedMoney, downPayment, monthsLeaseTerm,
                interestRate);
        assertEquals(expectedMonthlyPayment, actualMonthlyPayment, 0.01);

        // Test case 4: High interest rate
        totalLeasedMoney = 30000.0;
        downPayment = 5000.0;
        monthsLeaseTerm = 36;
        interestRate = 20.0;

        expectedMonthlyPayment = 833.3333333333334; // Calculated expected value
        actualMonthlyPayment = LeaseCalculator.calculateMonthlyPayment(totalLeasedMoney, downPayment, monthsLeaseTerm,
                interestRate);
        assertEquals(expectedMonthlyPayment, actualMonthlyPayment, 0.01);
    }
}
