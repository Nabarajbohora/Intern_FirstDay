package loop;
import methods.StaticMethod;
public class StaticAcceifier {
    public static void main(String[]args){
        double area = StaticMethod.calculateArea(50.0);
        System.out.print("Area in different package: "+area);
    }
}
