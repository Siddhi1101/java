//9. Write a Java program to copy one array list into another.  
 import java.util.ArrayList;
import java.util.List;
class Arraylist9{
	public static void main(String args[])
	{
	List<Integer> list=new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(6);
	System.out.println(list);
	
	List<Integer> newlist=new ArrayList();
	newlist.add(40);
	newlist.add(29);
	newlist.add(33);
	newlist.add(60);
	
	list.addAll(newlist);
	System.out.println(list);
	
	}
}