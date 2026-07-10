package Function;

public class MainProgram {

    public static int getTotal(int a, int b){
        return a+b;
    }
    public static void main(String[]args){
        int num1 = 12;
        int num2 = 10;
        int result = MainProgram.getTotal(num1,num2);
        System.out.println("the sum of ther number: "+result);
    }
}

