package String;
import java.util.Scanner;
public class StringCompare {
    public static  void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String s1 = sc.next();
        System.out.println("Enter Second String");
        String s2= sc.next();
        System.out.println("using eqwuals()"+s1.equals(s2));
        System.out.println("Using ignolre equal:"+s1.equalsIgnoreCase(s2));
    }
}
