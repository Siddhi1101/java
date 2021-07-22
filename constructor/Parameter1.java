/*6.Create a class to print an integer and a character using two functions having the same name but different sequence of the integer and the character parameters.For example, if the paramters of the first function are of the form (int n, char c), 
then that of the second function will be of the form (char c, int n).*/


class Parameter
{
   Parameter(int a, char b)
   {
      System.out.println("Integer is" +a+ " " + "Char" +b);
   }
  Parameter(char b,int c)
   {
      System.out.println("Integer is" +c+ " " + "Char" +b);
   }
}
public class Parameter1
{
  public static void main(String[] args)
  {
     Parameter p=new Parameter(40,'S');
     Parameter p1=new Parameter('S',60);
   }
}