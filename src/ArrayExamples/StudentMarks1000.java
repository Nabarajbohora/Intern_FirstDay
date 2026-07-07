package ArrayExamples;

import java.util.Scanner;

public class StudentMarks1000 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        int sum = 0;
        int highest;
        int lowest;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks of Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        highest = marks[0];
        lowest = marks[0];
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }
        double average = (double) sum / marks.length;
        System.out.println("\n------ RESULT ------");

        System.out.println("Total Students : " + marks.length);
        System.out.println("Total Marks    : " + sum);
        System.out.println("Average Marks  : " + average);
        System.out.println("Highest Marks  : " + highest);
        System.out.println("Lowest Marks   : " + lowest);
        sc.close();
    }
}