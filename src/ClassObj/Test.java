package ClassObj;
class Triangled {
    int side1;
    int side2;
    int side3;

    //no argument constructor
    Triangled() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }

    int getPerimeter() {
        return side1 + side2 + side3;
    }

    double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
public class Test {
    public static void main(String []args){
        Triangled t = new Triangled();
        System.out.println("Perimeter: "+t.getPerimeter());
        System.out.println("Area: "+t.getArea());

    }

}
