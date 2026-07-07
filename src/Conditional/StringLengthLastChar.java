package Conditional;



import java.util.Scanner;


public class StringLengthLastChar {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String str = sc.nextLine();
//
//        System.out.println("Length = " + str.length());
//
//        if(str.length() > 0)
//            System.out.println("Last Character = " + str.charAt(str.length() - 1));
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String Name = sc.next();

        System.out.println("Length ="+Name.length());
        if(Name.length()>0){
            System.out. println("Laxt character ="+Name.charAt(Name.length()-1));
    }
}
}