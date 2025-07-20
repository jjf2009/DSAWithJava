import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Num1: ");
        double num1 = in.nextDouble();

        System.out.print("Enter Num2: ");
        double num2 = in.nextDouble();

        double sum = num1 + num2;

        // Using %.2f to display only 2 decimal places
        System.out.printf("Sum of %.2f + %.2f = %.2f\n", num1, num2, sum);

        in.close();
    }
}
