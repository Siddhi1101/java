//3. Write a Java program to insert an element into the array list at the first position
import java.util.ArrayList;
import java.util.List;
 
 class Arraylist3
 {
 public static void main(String[]args)
	{
	 List<Integer> list=new ArrayList();
	 list.add(6);
	 list.add(7);
	 list.add(2);
	 list.add(8);
	 System.out.println(list);
	 
	 list.add(0,9);
	 System.out.println(list);
	 
	}
 }