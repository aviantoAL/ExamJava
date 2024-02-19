import java.util.*;



class BelajarMap{
 public static void main(String args[]){

 Map<Integer,String> map=new HashMap<Integer,String>();
 
 map.put(1,"nanas");
 map.put(4,"lemon");
 map.put(2,"apel");
 map.put(3,"semangka");
 
 map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

 
 
 
 
 
 
 }
} 