import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first line(a): ");
        String a = scanner.nextLine();

        System.out.print("Enter the second line(b): ");
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("The lines are identical");
        } else {
            System.out.println("The lines are not identical");
        }
    }
}
