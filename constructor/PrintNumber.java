//5. Create a class named 'PrintNumber' to print various numbers of different datatypes by creating different functions with the same name 'printn' having a parameter for each datatype.


class PrintNumber1
{

	PrintNumber1(int a, int b)
       {
	System.out.println("Sum of 2 integer is "+(a+b));
	}

	PrintNumber1(double a, double b)
        {
	System.out.println("Sum of 2 double is "+(a+b));
	}

	PrintNumber1(String a, String b)
        {
	System.out.println("Sum of 2 String is "+(a+b));
	}

}
 public class PrintNumber
    {
	public static void main(String args[])
       {

	
        PrintNumber1 p1 =new PrintNumber1(4,6);
        PrintNumber1 p2 =new PrintNumber1(1.5,5.8);
        PrintNumber1 p3 =new PrintNumber1("Good","Evening");
	//p.printn(4,6);
	//p.printn(1.5,5.8);
	//p.printn("Good","Evening");
	
	}

}