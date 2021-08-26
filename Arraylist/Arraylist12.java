//12.Write a Java program to extract a portion of a array list.
import java.util.*;
class Arraylist12
{
	public static void main(String args[])
	{
	 List<String> list=new ArrayList();
	 list.add("mango");
	 list.add("banana");
	 list.add("apple");
	 list.add("chiku");
	 System.out.println("list before extract portion: "+list);
	 List<String>sublist=list.subList(0,2);
	 System.out.println("list after extract portion: "+sublist);
	 }
}  