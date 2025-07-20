import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int year;
        boolean isLeap;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any Year: ");
        year = scanner.nextInt();

        // Leap year logic
        isLeap = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));

        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        scanner.close();
    }
}
