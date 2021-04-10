package com.mortgageCal;

import java.text.NumberFormat;

public class Report {
    private Mortgage calc;

    public Report(Mortgage calc) {
        this.calc = calc;
    }

    public void printMortgage(){
        System.out.println("\nMORTGAGE\n--------\nMonthly Payments: "
                + calc.calMortgage());
    }

    public void printMortgageSchedule(){
        System.out.println("\nPAYMENT SCHEDULE\n---------------");
        calc.paymentSchedule();
    }

}
