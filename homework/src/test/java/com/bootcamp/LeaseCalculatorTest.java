package com.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LeaseCalculatorTest {

        @Test
        public void testNormalValues() {
                double totalLeasedMoney = 30000.0;
                double downPayment = 5000.0;
                int monthsLeaseTerm = 36;
                double interestRate = 5.0;

                double expectedMonthlyPayment = 729.17;
                double actualMonthlyPayment = LeaseCalculator.calculateMonthlyPayment(totalLeasedMoney, downPayment,
                                monthsLeaseTerm, interestRate);
                assertEquals(expectedMonthlyPayment, actualMonthlyPayment, 0.01);
        }

        @Test
        public void testZeroDownPayment() {
                double totalLeasedMoney = 30000.0;
                double downPayment = 0.0;
                int monthsLeaseTerm = 36;
                double interestRate = 5.0;

                double expectedMonthlyPayment = 875.00;
                double actualMonthlyPayment = LeaseCalculator.calculateMonthlyPayment(totalLeasedMoney, downPayment,
                                monthsLeaseTerm, interestRate);
                assertEquals(expectedMonthlyPayment, actualMonthlyPayment, 0.01);
        }

        @Test
        public void testNoInterest() {
                double totalLeasedMoney = 30000.0;
                double downPayment = 5000.0;
                int monthsLeaseTerm = 36;
                double interestRate = 0.0;

                double expectedMonthlyPayment = 694.44;
                double actualMonthlyPayment = LeaseCalculator.calculateMonthlyPayment(totalLeasedMoney, downPayment,
                                monthsLeaseTerm, interestRate);
                assertEquals(expectedMonthlyPayment, actualMonthlyPayment, 0.01);
        }

        @Test
        public void testHighInterestRate() {
                double totalLeasedMoney = 30000.0;
                double downPayment = 5000.0;
                int monthsLeaseTerm = 36;
                double interestRate = 20.0;

                double expectedMonthlyPayment = 833.33;
                double actualMonthlyPayment = LeaseCalculator.calculateMonthlyPayment(totalLeasedMoney, downPayment,
                                monthsLeaseTerm, interestRate);
                assertEquals(expectedMonthlyPayment, actualMonthlyPayment, 0.01);
        }
}
