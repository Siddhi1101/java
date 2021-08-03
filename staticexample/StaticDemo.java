public class StaticDemo{
	int num1 = 6;
	static int num2 = 10;
	
	public static void main(String args[]){
	StaticDemo s1 = new StaticDemo();
	StaticDemo s2 = new StaticDemo();
	
	s1.num1=25;
	s1.num2=10;
	s2.num1=35;
	s2.num2=51;
	System.out.println(s1.num1 +" "+s1.num2+" "+s2.num1+" "+s2.num2);
	}

}