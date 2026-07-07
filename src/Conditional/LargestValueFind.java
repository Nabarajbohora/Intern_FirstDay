package Conditional;

import java.util.ArrayList;
import java.lang.*;
import java.util.*;

public class LargestValueFind {
//    static int biggestOfThree(int x, int y, int z){
//        if(x>= y && x>= z)
//            return x;
//        else if(y>= x && y>=z)
//            return y;
//        else
//            return z;
//    }
//    public static  void main(String[]args){
////        Usiing Ternary Operator.
//        int a = 5;
//        int b = 11000;
//        int c = 3000;
//
//        int largest = biggestOfThree(a, b, c);
//        System.out.println(largest+" is the largest number");
//
//    }
//Using Collections.max()
    public static void main(String[]args){
        int a = 4;
         int b = 7;
         int c = 1;

         ArrayList<Integer> x = new ArrayList<>();
         x.add(a);
         x.add(b);
         x.add(c);
         System.out.println(Collections.max(x)+ "is the largest number");
    }
}
