package ClassObj;

import java.util.Scanner;

class Rectangle {
    int breadth;
    int lenght;
    public  void setDim(int length,int breadth){
        this.lenght = length;
        this.breadth = breadth;
    }
    public int getArea(){
        return  lenght * breadth;

    }
}
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);//for user input

        Rectangle react = new Rectangle(); //create object

        System.out.println("== Calculate the rectangle===");
        System.out.println("Enter length: ");
        int leangth = sc.nextInt();

        System.out.println("Enter breadth: ");
        int breadth = sc.nextInt();

        react.setDim(leangth ,breadth);

        System.out.println("Area of rectangle: " +react.getArea());
        sc.close();
    }

}