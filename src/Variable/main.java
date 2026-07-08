package Variable;

 class Students {
    //Static variable -> for the all all students same value;
    static String collegeName = "tribhuvan university";

    //instance variable -> for used  which is each students diffrent values:
    String Name;
    int  rollno;
    //constructior
    Students(String name,int rollno){
        this.Name = name;
        this.rollno = rollno;
    }
    void display(){
        System.out.println("name "+Name);
        System.out.println("rollmo "+rollno);
        System.out.println("College Name: "+collegeName);
        System.out.println("..............");
    }

}
public class main{
         public static  void main(String[] args) {

             Students s1 = new Students("Ram", 1);
             Students s2 = new Students("Shyam", 2);
             Students s3 = new Students("Hari", 3);

             s1.display();
             s2.display();
             s3.display();

             // change the static variable n
             System.out.println("\n Change the college name :\n");
             Students.collegeName = "kathmandu university";
             s1.display();
             s2.display();
             s3.display();

         }

}
