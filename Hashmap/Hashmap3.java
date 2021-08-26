//3. Write a Java program to copy all of the mappings from the specified map to another map.  
import java.util.*;  
public class Hashmap3{  
  public static void main(String args[]) {  
  HashMap<Integer,String> hash_map1= new HashMap<Integer,String>();
  HashMap<Integer,String> hash_map2= new HashMap<Integer,String>();  
   
  hash_map1.put(1, "Red");
  hash_map1.put(2, "Green");
  hash_map1.put(3, "Black");
  System.out.println("values in first map:"+hash_map1);
  
  hash_map2.put(4, "White");
  hash_map2.put(5, "Blue"); 
   System.out.println("values of second map:"+hash_map2);  
   hash_map2.putAll(hash_map1);
   
   System.out.println("values of hashmap:"+hash_map2);  
   
 }  
}