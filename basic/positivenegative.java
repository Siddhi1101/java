import java.util.Scanner;
public class positivenegative
{
	public static void main(String[]args)
{
	int a;
	Scanner Scanner;
	Scanner=new Scanner(System.in);
	System.out.println("enter the number: ");
	a=Scanner.nextInt();
	if(a>0)
	{
	System.out.println("numbner is positive");

	}
	else if(a<0)
	{
	System.out.println(" number is negative");

	}
	else
	{
	System.out.println("number is zero");
	}
     }
}