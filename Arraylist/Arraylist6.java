//6. Write a Java program to remove the third element from a array list.
import java.util.ArrayList;
import java.util.List;
class Arraylist6{
	public static void main(String[]args)
	{
	List<Integer> list=new ArrayList();
	list.add(45);
	list.add(67);
	list.add(34);
	list.add(78);
	list.add(30);
	list.add(28);
	list.add(10);
	System.out.println(list);
	
	list.remove(3);
	System.out.println(list);
	}
	}