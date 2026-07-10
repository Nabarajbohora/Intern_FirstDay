package recursion;

import java.util.Scanner;

public class RecursionExample {
     public static int factorial(int n) {
         if (n == 1) {
             return 1;
         }
         return n * factorial(n - 1);
     }
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Number to find its factorial");
            int num = sc.nextInt();

            if (num< 0 ){
                System.out.print("factorial is not defined for negative numbers");

            }else{
                long result = factorial(num);
                System.out.println("Factorial of " + num + " is: " + result);
                System.out.println("(Recursive calls: " + num + " → " + (num-1) + " → ... → 1)");
            }

            sc.close();
            }

        }

