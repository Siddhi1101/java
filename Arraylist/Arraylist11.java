//11. Write a Java program to reverse elements in a array list.
import java.util.*;
class Arraylist11
{
	public static void main(String args[])
	{
	List<Integer> list=new ArrayList<Integer>();
	list.add(1);
	list.add(7);
	list.add(3);
	list.add(6);
	list.add(8);
	list.add(9);
	list.add(2);
	System.out.println(list);
	Collections.reverse(list);
	System.out.println("reverselist: "+list);
	}
}