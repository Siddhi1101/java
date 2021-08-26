//20. Write a Java program to increase the size of an array list.
import java.util.ArrayList;
import java.util.Collections;
  public class Arraylist20 
  {
  public static void main(String[] args)
  {
          ArrayList<String> list= new ArrayList<String>(3);
          list.add("mango");
          list.add("apple");
          list.add("chikku");
          System.out.println("Original array list: "+list);
     
          list.ensureCapacity(6);
          list.add("pinapple");
          list.add("watermelon");
          list.add("grapes");
          System.out.println("New array list: "+list);
   }
  }