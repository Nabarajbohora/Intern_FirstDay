package ArrayExamples;

import java.util.Scanner;

public class ArrayOperation {
    public static int[] readArrayElements() {
        Scanner sc = new Scanner(System.in);
        System.out.println("how much you can set ArraySize...!");
        int size = sc.nextInt();
        int[] num = new int[size];//user le Banako size ko array

        System.out.println("please " + size + "  Enter numbers  :");
        for (int i = 0; i < size; i++) {
            System.out.println("Number" + (i + 1) + ":");
            num[i] = sc.nextInt();
        }
        return num;
    }

    public static void SumAndAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

        }
        double average = (double) sum / arr.length;
        System.out.println("\n SUM & AVERAGE:");
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
       public static void main(String[]args){
            int[] myArray = readArrayElements();  // from  user take input
            SumAndAverage(myArray);// sum and average
        }
    }

