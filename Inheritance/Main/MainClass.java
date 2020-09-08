package Inheritance.Main;

import Inheritance.A.A;
import Inheritance.B.B;
import Inheritance.C.C;

public class MainClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.Name = "Ram";
        obj.Classs = 11;
        
        B obj2 = new B();
        obj2.Marks = 50;
        obj2.Name = "Ravi";
        obj2.Classs = 12;
        obj2.RollNo = 28;

        C obj3 = new C();
        obj3.Marks = 60;
        obj3.Name = "Suresh";
        obj3.Classs = 10;
        obj3.RollNo = 35;
        obj3.Student_id = 231217;
        obj3.Surname = "Singh";

        obj.show();
        System.out.println("My name is " + obj.Name + ". I am from class " + obj.Classs);

        obj2.display();
        System.out.println("My name is " + obj2.Name + ". I am in class " + obj2.Classs + " My Roll No is " + obj2.RollNo + " I got " + obj2.Marks + " Marks");
       
        obj3.print();
        System.out.println("My name is " + obj3.Name + ". I am in class " + obj3.Classs + " My Roll No is " + obj3.RollNo + " I got " + obj3.Marks + " Marks" + " My student Id is : " + obj3.Student_id + " My Surname is: " + obj3.Surname);
    }
}