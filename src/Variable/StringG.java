package Variable;

import recursion.RecursionDemo;

import java.util.Scanner;

public class StringG {
    public static void  main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of number Factorial");

        int factorial = sc.nextInt();
              int  factor=  RecursionDemo.calculateFactorial(factorial);
                  System.out.print("your value if "+factor);

    }
}
