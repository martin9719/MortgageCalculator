package com.mortgageCal;

import java.text.NumberFormat;

public class Mortgage {
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;
    private double monthlyRate;
    private short numOfPayments;
    private int principal;
    private float annualInterest;
    private byte years;

    public Mortgage(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public String calMortgage(){
        setMonthlyRate();
        setNumOfPayments();
        return getCurrencyFormat(getMonthlyPay());
    }

    private double getMonthlyPay() {
        return principal * (monthlyRate * Math.pow(1 + monthlyRate, numOfPayments)
                / (Math.pow(1 + monthlyRate, numOfPayments) - 1));
    }

    public void paymentSchedule(){
        for (int month = 1; month <= numOfPayments; month++){
            System.out.println(getCurrencyFormat(getRemainingBal(month)));
        }
    }

    private String getCurrencyFormat(double remainingBal) {
        return NumberFormat.getCurrencyInstance().format(remainingBal);
    }

    private double getRemainingBal(int month) {
        return principal * ((Math.pow(1 + monthlyRate, numOfPayments) - Math.pow(1 + monthlyRate, month))
                / (Math.pow(1 + monthlyRate, numOfPayments) - 1));
    }

    private void setMonthlyRate() {
        this.monthlyRate = annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    private void setNumOfPayments() {
        this.numOfPayments = (short) (years * MONTHS_IN_YEAR);
    }

}
