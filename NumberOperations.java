import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number(a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number(b): ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        String divisionResult;
        if (b != 0) {
            divisionResult = String.valueOf((double) a / b);
        } else {
            divisionResult = "Division by zero is not possible";
        }

        System.out.println("The amount: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Composition: " + product);
        System.out.println("Private: " + divisionResult);
    }
}
