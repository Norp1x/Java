import java.util.Scanner;

public class Learn {

    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = abc.next();
        System.out.println("Your name is: " + name);
        abc.close();

        System.out.println("What is your age?");
        int age = abc.nextInt();
        System.out.println("Your age: " + age);
        abc.close();

        System.out.println("What is your Salary?");
        double salary = abc.nextDouble();
        System.out.println("Your age: " + salary);
        abc.close();



    }
}