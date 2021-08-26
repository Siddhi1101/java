//18. Write a Java program to test an array list is empty or not.  
 import java.util.ArrayList;
import java.util.Collections;
class Arraylist18
{
	public static void main(String args[])
	{
	 ArrayList<String> list=new ArrayList<String>();
	 list.add("mango");
	 list.add("banana");
	 list.add("apple");
	 list.add("chiku");
	 System.out.println(list);
	  System.out.println("Checking the above array list is empty  "+list.isEmpty());
          list.removeAll(list);
          System.out.println("Array list after remove all elements "+list);   
          System.out.println("Checking the above array list is empty "+list.isEmpty());
   }
	 
}
