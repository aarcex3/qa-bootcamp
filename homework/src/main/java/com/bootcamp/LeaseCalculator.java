package com.bootcamp;

public class LeaseCalculator {
    public static double calculateMonthlyPayment(double totalLeasedMoney, double downPayment, int monthsLeaseTerm,
            double interestRate) {
        double financedAmount = totalLeasedMoney - downPayment;
        double totalInterest = financedAmount * (interestRate / 100);
        double monthlyPayment = (financedAmount + totalInterest) / monthsLeaseTerm;
        return monthlyPayment;
    }
}
