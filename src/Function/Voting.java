package Function;

import java.util.Scanner;

public class Voting {
    public static boolean isEligibleToVote(int age){
        return age>=18;
    }
public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("--- Voting Eligibility Checker ---");
    System.out.print("Please enter your age: ");

while (!sc.hasNextInt()) {
        System.out.println("Error: Please enter a valid whole number for age.");
        sc.next();
        System.out.print("Please enter your age: ");
    }
    int userAge = sc.nextInt();
    boolean eligible = Voting.isEligibleToVote(userAge);
    if (eligible) {
        System.out.println("Status: You are eligible to vote!");
    } else {
        System.out.println("Status: You are not eligible to vote yet.");
    }
    sc.close();
}
}

