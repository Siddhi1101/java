//2. Write a Java program to count the number of key-value (size) mappings in a map.  
import java.util.*;  
public class Hashmap2{  
  public static void main(String args[]) {  
  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
  hash_map.put(1, "Red");
  hash_map.put(2, "Green");
  hash_map.put(3, "Black");
  hash_map.put(4, "White");
  hash_map.put(5, "Blue"); 
   System.out.println("size of hashmap:"+hash_map.size());  
   
 }  
}