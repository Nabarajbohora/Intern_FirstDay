package constructor;
class Rectangle{
    int leangth;
    int breadth;

    Rectangle(int leangth, int breadth){
        this.breadth = breadth;
        this.leangth = leangth;
    }
     int Area(){
        return leangth * breadth;
     }
}
public class Main {
    public static void main(String[]args){
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(5,9);
       System.out.println("Area 1 :"+r1.Area());

    }
}
