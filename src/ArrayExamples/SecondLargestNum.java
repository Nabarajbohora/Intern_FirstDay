package ArrayExamples;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestNum {
    static int getSecondLarget(int[]arr){
        int n = arr.length;
        Arrays.sort(arr);
        for( int i= n - 2; i>=0; i--){
            if(arr[i] !=arr[n -1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[]args){
         int []arr={45, 56, 87, 21, 63};

System.out.println(getSecondLarget(arr));
    }
}
