package loop;

import java.util.Scanner;

public class DoWhileExamplee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = -1;

        do {
            System.out.println("\n--- Day of the Week Menu ---");
            System.out.println("Enter a number (1-7) to pick a day, or 0 to Exit:");
            String input = scanner.next();

            try {
                day = Integer.parseInt(input);

                switch (day) {
                    case 1 -> System.out.println("Day 1 is Sunday");
                    case 2 -> System.out.println("Day 2 is Monday");
                    case 3 -> System.out.println("Day 3 is Tuesday");
                    case 4 -> System.out.println("Day 4 is Wednesday");
                    case 5 -> System.out.println("Day 5 is Thursday");
                    case 6 -> System.out.println("Day 6 is Friday");
                    case 7 -> System.out.println("Day 7 is Saturday");
                    case 0 -> System.out.println("Exiting program. Goodbye!");
                    default -> System.out.println("Invalid choice! Please choose between 1 and 7.");
                }
            } catch (NumberFormatException e) {

                System.out.println("Error: That is not a number! Please enter 1-7 or 0.");
            }

        } while (day != 0);

        scanner.close();
    }
}
