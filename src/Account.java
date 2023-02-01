import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);
        Account account = new Account();
        System.out.println("Starting balance: " + account.getBalance());
        System.out.print("Enter the deposit amount: ");
        double depositAmount = readLine.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Balance after deposit: " + account.getBalance());
        System.out.print("Enter the withdraw amount: ");
        double withdrawAmount = readLine.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Balance after withdraw amount " + account.getBalance());
    }
}
public class Account {
    private double balance;
    public Account() {
        this.balance = 0;
    }
    public void deposit(double value) {
        this.balance += value;
    }
    public void withdraw(double value) {
        if (value <= this.balance) {
            this.balance -= value;
        } else {
            System.out.println("Not enough money to withdraw :(");
        }
    }
    public double getBalance() {
        return this.balance;
    }
}
