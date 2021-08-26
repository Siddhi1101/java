//10. Write a Java program to shuffle elements in a array list.  
import java.util.*;
class Arraylist10
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
	System.out.println("list before shuffling: "+list);
	Collections.shuffle(list);
	System.out.println("list after shuffling: "+list);
	}
}