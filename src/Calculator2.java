import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String operator;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        operator = scanner.next();
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case "+" -> System.out.println(num1 + num2);
            case "-" -> System.out.println(num1 - num2);
            case "*" -> System.out.println(num1 * num2);
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println(num1 / num2);
                }
            }
            default -> System.out.println("Invalid operator.");
        }
    }
}
