package com.gitlab.StefanDeWolfe.AbstractFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPatternExample {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bankName = "";
        String loanName = "";
        double rate = 0;
        double loanAmount = 0;
        int years = 0 ;
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Bank bank = null;
        Loan loan = null;
        while (bank == null) {
            System.out.print("Enter the name of Bank from where you want to take loan amount: ");
            bankName = br.readLine();
            System.out.print("\n");

        }
        while (loan == null) {
            System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");
            loanName = br.readLine();
            bank = bankFactory.getBank(bankName);
            System.out.print("\n");
            System.out.print("Enter the interest rate for "+bank.getBankName()+ ": ");

            rate = Double.parseDouble(br.readLine());
            System.out.print("\n");
            System.out.print("Enter the loan amount you want to take: ");

            loanAmount = Double.parseDouble(br.readLine());
            System.out.print("\n");
            System.out.print("Enter the number of years to pay your entire loan amount: ");
            years = Integer.parseInt(br.readLine());

            System.out.print("\n");
            System.out.println("you are taking the loan from "+ bank.getBankName());

            loan = loanFactory.getLoan(loanName);
        }
        loan.getInterestRate(rate);
        loan.calculateLoanPayment(loanAmount, years);
    }
}
