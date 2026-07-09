package methods;

public class StaticMethod {
    public static double  calculateArea( double radius){
        return Math.PI *radius;
    }
    public static void main(String[]args){
                //double =datatype
                //area = name
                // = assign
                // StaticMethod = className
                //calculateArea = methodName
                //(2.0) = InputValue
        double area = StaticMethod.calculateArea(2.0);
        System.out.println("Area of circle: "+area);
    }
}
