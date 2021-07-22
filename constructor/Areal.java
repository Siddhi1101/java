/*7.Create a class to print the area of a square and a rectangle. The class has two functions with the same name but different number of parameters. The function for printing the area of rectangle has two 
parameters which are its length and breadth respectively while the other function for printing the area of square has one parameter which is the side of the square.*/


class Area1
{
   Area1(int x,int y)
  {
    System.out.println(x*y);
  }
   Area1(int z)
  {
    System.out.println(z*z);
  }
}
public class Area2
{
  public static void main(String[] args)
  {
     Area1 d=new Area1(34,42);
     Area1 d1=new Area1(50);
  }
}