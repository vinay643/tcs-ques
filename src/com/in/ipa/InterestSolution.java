package com.in.ipa;
import java.util.Scanner;
public class InterestSolution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        Account ac=new Account(a,b,c);

        int yer=sc.nextInt();

        System.out.printf("%.3f%n",intestAmount(ac,yer));


    }
    public static double intestAmount(Account ac,int yer){

        double adInts=((ac.getInterestRate()*yer)/100)+ac.getInterestRate();
        double inteAm=(adInts*ac.getBalance())/100;
        return inteAm;

    }
}


class Account{
    private int id;
    private double balance;
    private double interestRate;

    public int getId() {
        return id;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public Account(int id, double interestRate, double balance) {
        this.id = id;
        this.interestRate = interestRate;
        this.balance = balance;
    }
}
