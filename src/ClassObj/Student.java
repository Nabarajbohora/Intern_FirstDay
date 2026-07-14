package ClassObj;
class Teacher {
    String name;
    int id;
}
public class Student {
        public static void main(String[]args){

            Teacher t1 = new Teacher();
            t1.name = "Ram";
            t1.id  = 102;
            System.out.println("Teacher Name :"+t1.name);
            System.out.println("Rollno: "+t1.id);
        }

}

