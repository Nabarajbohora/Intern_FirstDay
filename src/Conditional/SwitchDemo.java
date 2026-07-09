package Conditional;

import java.util.Scanner;

public class SwitchDemo{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number 1-7:");
        int DayNumber = sc.nextInt();
        switch (DayNumber){
            case 1:
            System.out.println("Sunday");
                break;
                case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("wednesday");
            break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println(" Saturday");
                break;
            default:
                System.out.println("you chose Invalid number");
                break;
        }



    }
}
