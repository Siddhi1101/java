//2. Write a Java program to iterate through all elements in a array list.  
 import java.util.ArrayList;
import java.util.List;
class Arraylist2{
	public static void main(String[]args)
	{
	List<String> list=new AraayList();
	list.add("lotus");
	list.add("rose");
	list.add("marrigold");
	list.add("lily");
	System.out.println(list);

	for(int i=0;i<list.size();i++)
	{
	System.out.println(list.get(i));
	}
	}
}