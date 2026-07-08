package Variable;

public class Student{
    String name;
    int age;
    double salary;
        Student(String name,int age,double salary){
            this.name = name;
            this.age = age;
            this.salary = salary;
        }
        void Display(){
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Name:"+salary);
            System.out.println(".......");
    }
    public static void main(String[]args){
            //object one
            Student s1 = new Student("Ram", 20, 2500.0);
            s1.Display();

            //obj two
        Student s2  = new Student("Nabaraj",22,75000.00);
        s2.Display();


        System.out.println("First Student Name:" +s1.name);
        System.out.println("Second Student Name:"+s2.name);
    }
}