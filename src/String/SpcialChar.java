package String;
import java.io.*;

public class SpcialChar {
    public static void main(String[]args){
        String n = "!@#$%^&1*()_-=Nabaraj";
        int count = 0;
//        Iterating through the string to
//        check the special characters
        for(int i= 0; i< n.length(); i++){
//            if Character is not a letter digit or space
//            Special character
            if(!Character.isLetterOrDigit(n.charAt(i)) &&
                        !Character.isWhitespace(n.charAt(i))){
                count++;
            }

        }
        if (count > 0){
            System.out.println("special char found:"+count);
        }else{
            System.out.println("no special character found.");
        }
    }
}
