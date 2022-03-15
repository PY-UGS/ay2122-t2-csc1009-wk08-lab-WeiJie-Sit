package T8.Q2;

import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(111,0);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter deposit amount> ");
        double dAmount = sc.nextDouble();
        account.deposit(dAmount);

        System.out.print("Enter withdraw amount> ");
        double wAmount = sc.nextDouble();
        try {
            account.withdraw(wAmount);
            System.out.println("The balance after withdraw is: $"+account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry, but your account is short by: $"+(wAmount-account.getBalance()));
        }

        sc.close();
    }
}
