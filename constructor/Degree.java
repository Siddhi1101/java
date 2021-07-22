/*9.Create a class 'Degree' having a function 'getDegree' that prints "I got a degree". It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a function with the same name 
that prints "I am an Undergraduate" and "I am a Postgraduate" respectively. Call the function by creating an object of each of the three classes.*/


class Getdegree
{
   Getdegree()
   {
     System.out.println("I got a degree");
   }
}

class Undergraduate
{
   Undergraduate()
   {
     System.out.println("I am an undergraduate");
    }
}

class Postgraduate
{
   Postgraduate()
   {
      System.out.println("I am an postgraduate");
   }
}

public class Degree
{
   public static void main(String[] args)
   {
     Getdegree d=new Getdegree();
     Undergraduate u=new Undergraduate();
     Postgraduate p=new Postgraduate();
   }
}
