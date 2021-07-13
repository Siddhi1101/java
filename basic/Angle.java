import java.util.Scanner;
public class Angle
{
	public static void main(String[]args)
{
	double a,b,c;
	Scanner Scanner;
	Scanner=new Scanner(System.in);
	System.out.println("enter first angle: ");
	a=Scanner.nextDouble();
	System.out.println("enter second angle: ");
	b=Scanner.nextDouble();
 	c=180-(a+b);
	System.out.println("third  angle of triangle: "+c);
}
}