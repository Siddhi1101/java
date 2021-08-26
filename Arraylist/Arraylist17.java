//17. Write a Java program to empty an array list.  
import java.util.*;
class Arraylist17
{
	public static void main(String args[])
	{
	 List<String> list=new ArrayList();
	 list.add("mango");
	 list.add("banana");
	 list.add("apple");
	 list.add("chiku");
	 System.out.println(list);
	 list.removeAll(list);
	 System.out.println("empty list: "+list);
	 }
}