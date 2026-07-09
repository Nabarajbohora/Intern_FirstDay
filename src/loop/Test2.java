package loop;

import methods.Students;

public class Test2 {
    public static void main(String[]args){
        int Num1 = 78;
        int Num2  = 2;

        Students obj = new Students();
                int result = obj.addNumber(Num1, Num2);
        System.out.println("result :"+result);
    }
}
