package String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[]args){
//        Using Array
        //        Scanner sc = new Scanner(System.in);
        //        System.out.println("Enter String");
        //        String str = sc.nextLine();
        //        for(int i = str.length()-1; i>=0; i--)
        //            System.out.println(str.charAt(i));


        //   using for loop..........
                    //        String S = "Nabaraj";
                    //        String R = "";
                    // for(int i = 0; i<S.length();i++){
                    //     R= S.charAt(i)+R;
                    //
                    // }
                    // System.out.println(R);

//        Using StringBuilder.reverse()
                            String s = "heera";
                            StringBuilder res =new StringBuilder();	// Object Initialised
                            res.append(s);  // Appending elements of s in res
                            res.reverse(); // reverse StringBuilder res

                            System.out.println(res);









       }
}
