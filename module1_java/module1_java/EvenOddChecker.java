import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to check: ");
        int number = scanner.nextInt();

        if (number % 2 == 0)
            System.out.println("The number is Even.");
        else
            System.out.println("The number is Odd.");

        scanner.close();
    }
}
