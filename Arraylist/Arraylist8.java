//8. Write a Java program to sort a given array list.
import java.util.*;
class Arraylist8
{
	public static void main(String args[])
	{
	 List<String> list=new ArrayList();
	 list.add("1");
	 list.add("5");
	 list.add("2");
	 list.add("10");
	 System.out.println("list before sort: "+list);
	 Collections.sort(list);
	 System.out.println("list after sort: "+list);
	 }
}
