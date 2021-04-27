package com.mortgageCal;

//import java.text.NumberFormat;
//import java.util.Scanner;

public class Main {
//    final static byte MONTHS_IN_YEAR = 12;
//    final static byte PERCENT = 100;

    public static void main(String[] args) {
	// write your code here
        int principal = (int) Input.readNumber("Principal ($1K - $1M): ", 1000, 1_000_000);
        float annualInterest = (float) Input.readNumber("Rate: ", 1, 30);
        byte years = (byte) Input.readNumber("Period (Years): ", 1, 30);

        var calc = new Mortgage(principal,annualInterest,years);
        var report = new Report(calc);
        report.printMortgage();
        report.printMortgageSchedule();

//        double monthlyRate = annualInterest / PERCENT / MONTHS_IN_YEAR;
//        short numOfPayments = (short)(years * MONTHS_IN_YEAR);

//        double monthlyPay = calMortgage(principal, monthlyRate, numOfPayments);
//        System.out.println("\nMORTGAGE\n--------\nMonthly Payments: " + NumberFormat.getCurrencyInstance().format(monthlyPay));
//
//        System.out.println("\nPAYMENT SCHEDULE\n---------------");
//        paymentSchedule(principal, monthlyRate, numOfPayments);
    }

//    public static double readNumber(String prompt, double min, double max){
//        Scanner scanner = new Scanner(System.in);
//        double value;
//        while (true) {
//            System.out.print(prompt);
//            value = scanner.nextFloat();
//            if (value >= min && value <= max)
//                break;
//            System.out.println("Enter a value between "+ min + " and " + max);
//        }
//        return value;
//    }

//    public static double calMortgage(int principal, double monthlyRate, short numOfPayments) {
//        double monthlyPay = principal * (monthlyRate * Math.pow(1 + monthlyRate, numOfPayments)
//                / (Math.pow(1 + monthlyRate, numOfPayments) - 1));
//        return monthlyPay;
//    }

//    public static void paymentSchedule(int principal, double monthlyRate, short numOfPayments){
//        for (int payments = 1; payments <= numOfPayments; payments++){
//            double remainingBal = principal * ((Math.pow(1+monthlyRate, numOfPayments) - Math.pow(1+monthlyRate, payments))
//                    / (Math.pow(1+monthlyRate, numOfPayments) -1 ));
//            System.out.println(NumberFormat.getCurrencyInstance().format(remainingBal));
//        }
//    }
}

