import java.util.Scanner;

public class BankAccount {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String name;
        int accountNo;
        double balance;

        System.out.print("Enter Account Number: ");
        accountNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();

        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number : " + accountNo);
        System.out.println("Account Holder : " + name);
        System.out.println("Available Balance : " + balance);
    }
}