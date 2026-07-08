package Variable;

public class Variables {

    public static void main(String[]args){
//        Local variable (under the method)
      int  age = 45;          //Local variable
      String name = "ram";    // LOCAL  variable
      double salary = 3600.0; // Local variable

        System.out.println("Name: "+name);
        System.out.println("Name: "+ age);
        System.out.println("Name: "+salary);
//        under the block local variable ;
        if(age >0){
            String message = "Bachha hoi";
            System.out.println(message);
        }
}
}