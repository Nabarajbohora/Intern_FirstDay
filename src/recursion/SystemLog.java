package recursion;

import java.util.Scanner;

public class SystemLog {
    private static Scanner sc = new Scanner(System.in);
    private static final int correct_pin = 1234;

    public static void checkpin(int attemptRemaining){
        if(attemptRemaining == 0){
            System.out.println("Card blocked  ! tO many incorrect attempt. ");
            return;
        }
        System.out.print("Enter your 4-Digit PIN(Attempt left:"+attemptRemaining);
        while(!sc.hasNextInt()){
            System.out.println("Invalid input ! please Enter number only .");
            sc.next();
        }
        int userpin = sc.nextInt();
         if(userpin == correct_pin){
             System.out.println("Access granted ! Welcome to YenyaSoft System.");
             return;

         }
         System.out.println("Incorrect Pin please try again.");
         checkpin(attemptRemaining-1);

    }
    public static void main(String[]args){
        System.out.println("System Initialization---");
        SystemLog.checkpin(10);
        sc.close();
    }
}
