package Java_Thi;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String args[]) {
        double balance, rate, year, interest;
        Scanner scan = new Scanner(System.in);
        System.out.print("\n" + "Enter the amount deposited in the bank : ");
        balance = scan.nextDouble();
        System.out.print("\n" + "Enter annual interest rate (%) : ");
        rate = scan.nextDouble();
        System.out.print("\n" + "Enter the sending time (in years) : ");
        year = scan.nextDouble();
        scan.close();
        interest = balance * (rate * year / 1200);
        System.out.print("\n" + "The interest amount is: " + interest);
    }
}
