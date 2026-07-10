package recursion;

public class SimpleRecursion {
    public static int  sum( int n){
        if(n == 0){
            return 0;
        }
        return  n + sum(n-1);
    }
    public static void main(String[]args){
        int result = SimpleRecursion.sum(5);
        System.out.print("5 to 1 total sum: "+result);
    }
}
