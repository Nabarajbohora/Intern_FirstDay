package methods;


public class Students {
     public int   addNumber(int a, int b){
        int sum = a + b;
       return sum;


    }
    public static void main(String[]args){
        int num1 = 25;
        int num2 = 41;
        Students obj = new Students();
        // calling method
        int result = obj.addNumber(num1,num2);
        System.out.println("sum is: "+result);

    }
}
