//19. Write a Java program to trim the capacity of an array list the current list size.  
 
 import java.util.ArrayList;
import java.util.Collections;
class Arraylist19
{
	public static void main(String args[])
	{
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(1);
	list.add(7);
	list.add(3);
	list.add(6);
	list.add(8);
	list.add(9);
	list.add(2);
	System.out.println(list);
	System.out.println("Let trim to size the above array: ");
      
	list.trimToSize();
	System.out.println(list);
	}
}
 