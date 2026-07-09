package methods;

public class Test {
    public static void main(String[]args){
        int num1 =3;
        int num2 =5;
        Students obj = new Students();
        int result = obj.addNumber(num1, num2);
        System.out.println("sum is: "+result);
    }
}
