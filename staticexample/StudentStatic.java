//Java Program to demonstrate the use of static variable
class StudentStatic{
   int rollno;//instance variable
   String name;
   static String college ="ITS";//static variable
   //constructor
   Student(int r,String n){
   rollno = r;
   name = n;
   }
  
   void display ()
   {System.out.println(rollno+" "+name+" "+college);}
}
//Test class to show the values of static variable
public class TestStaticVariable1{
 public static void main(String args[]){
 Student s1 = new Student(1,"Siddhi");
 Student s2 = new Student(2,"Pooja");
 s1.display();
 s2.display();
 }
}