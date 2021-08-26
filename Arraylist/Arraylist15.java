//15. Write a Java program to join two array lists. 
import java.util.*;
class Arraylist15
{
	public static void main(String args[])
	{
	List<String> list=new ArrayList<String>();
	list.add("pink");
	list.add("black");
	list.add("brown");
	list.add("white");
	list.add("red");
	System.out.println(list);
	
	List<String> name=new ArrayList<String>();
	name.add("tom");
	name.add("jerry");
	name.add("arun");
	name.add("karan");
	name.add("shyam");
	name.add("berry");
	
	System.out.println(name);
	 List<String> a = new ArrayList<String>();
        a.addAll(list);
        a.addAll(name);
        System.out.println("New array: "+a);
	}
}
       