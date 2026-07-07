package OperaterExample;

import java.util.Scanner;

public class ArithmewticOperationExample {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number.");
        int Num1= sc.nextInt();

        System.out.println("Enter Second Number");
        int Num2 = sc.nextInt();
        if(Num1<= 0 ||Num2<=0){
            System.out.println("Error number ! both number can bue greater then Zero.");
        }else{
        System.out.println("Sum :"+(Num1+Num2));
            System.out.println("Products :"+(Num1*Num2));
            System.out.println("Difference :" +(Num1-Num2));
            System.out.println("Quoteint :"+(Num1/Num2));
            System.out.println("Remainder :"+(Num1%Num2));
        }
    }
}