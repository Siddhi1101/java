//7. Write a Java program to search an element in a array list.  
 
 import java.util.ArrayList;
import java.util.List;

class Arraylist7
{
	public static void main(String args[])
	{
	 List<String> list=new ArrayList();
	 list.add("mango");
	 list.add("banana");
	 list.add("apple");
	 list.add("chiku");
	 if(list.contains("chiku"))
	 {
	 System.out.println("found the element");
	 }
	 else
	 {
		System.out.println("Not found the element"); 
	 }
	 
	}
}