package ClassObj;
class Students{
    String name;
    int rollno;
    String phoneNumber;
    String Address;
}
public class StudentInformation {
    public static void main(String[]args){
         Students s1 = new Students();
         s1.name = "Shyam";
         s1.Address = "katahmandu";
         s1.rollno  = 3304;
         s1.phoneNumber = "9868312457";

        Students s2 = new Students();
         s2.name = "Nabaraj bohora";
         s2.rollno = 3305;
         s2.phoneNumber = "976161421";
         s2.Address = "Jajarkot";

         System.out.println("Students 1 details:" );
        System.out.println("Name: "+s1.name );
        System.out.println("RollNo: "+s1.rollno );
        System.out.println("MobileNumber: "+s1.phoneNumber );
        System.out.println("Address: "+s1.Address );

        System.out.println( );
        System.out.println("Students 2 details:" );
        System.out.println("Name: "+s2.name );
        System.out.println("RollNo: "+s2.rollno );
        System.out.println("MobileNumber: "+s2.phoneNumber );
        System.out.println("Address: "+s2.Address );
    }

}
