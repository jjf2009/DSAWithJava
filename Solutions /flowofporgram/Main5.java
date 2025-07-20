import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;

        System.out.println("Enter numbers to add. Type 'x' to stop.");

        while (true) {
            System.out.print("Enter a number or 'x' to exit: ");
            String input = in.next();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            try {
                double num = Double.parseDouble(input);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x' to exit.");
            }
        }

        System.out.println("Sum = " + sum);
        in.close();
    }
}
