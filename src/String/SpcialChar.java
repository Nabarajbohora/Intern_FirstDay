package String;
public class SpcialChar {
    public static void main(String[]args){
        String n = "!=Nabaraj";
        int count = 0;
       for(int i =0; i<n.length();i++){
           if(!Character.isLetterOrDigit(n.charAt(i))&&
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
