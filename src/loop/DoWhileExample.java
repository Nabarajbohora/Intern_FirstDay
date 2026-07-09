package loop;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {

            System.out.print("कृपया १ देखि १० सम्मको संख्या हाल्नुहोस्: ");
            number = scanner.nextInt();

            if (number < 1 || number > 10) {
                System.out.println("गलत ! १ र १० बीचको मात्र हाल।");
            }

        } while (number < 1 || number > 10);

        System.out.println("सही ! तपाईंले " + number + " हाल्नुभयो।");
        scanner.close();
    }
}