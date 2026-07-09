package methods;

public class StaticAnotherClassAccess {

    static void main(String[]args){
        double area = StaticMethod.calculateArea(5.0);
        System.out.println("Area is :"+area);
    }
}
