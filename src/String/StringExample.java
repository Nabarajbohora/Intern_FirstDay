package String;

import java.util.Scanner;

public class StringExample {
    String name;
    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter you Name:");
//        String name= sc.next();
//        System.out.println(" your name length is "+  name.length());
//        if(name.length() >0){
//            System.out.println("Last character is :"+name.charAt(name.length()-1));
//        }else {
//            System.out.println(" The length is empty");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
         String name = sc.next();
         System.out.println("your name lenght is "+name.length());
         if(name.length()>0){
             System.out.println("Last character is "+name.charAt(name.length()-1));
         }else{
             System.out.println("the lenght is empty");
         }
           }
}
