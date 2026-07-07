package OperaterExample;
import java.util.Scanner;
public class AssignmentOperation {
    public static void main (String[]args){
        int age;
        Scanner sc= new Scanner(System.in);
         System .out.println("Enter your age :");
      age = sc.nextInt();
      System.out.println("your age is "+age);
      if(age >=18){
          System.out.println("now you are currently aces this feature goodluck !");
      }
       else if (age >18) {
           System.out.println("you can access this feature:");
        }else{
           System.out.println("you can not access!");
      }
    }
}
// now in the requirement phase we are access to the nation but we have access to the you can read for more information
