//4. Write a Java program to retrieve an element (at a specified index) from a given array list.  
 import java.util.ArrayList;
import java.util.List;

class Arraylist4
{
	public static void main(String args[])
	{
	 List<String> list=new ArrayList();
	 list.add("mango");
	 list.add("banana");
	 list.add("apple");
	 list.add("chiku");
	 
	 System.out.println(list);
	 System.out.println("first element:" +list.get(0));
	 System.out.println("third element:" +list.get(2));
	 
	 
	 }
}