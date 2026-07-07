package String;

import java.util.Scanner;

public class StringTest {
    String name;
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String values:");
        String name = sc.next();
         System.out.println("your char lenght is :"+name.length());

         if(name.length()>0){
             System.out.println("Length of character "+name.charAt(name.length()-1));

         }else{
             System.out.println("empty char!");
         }

    }
}
