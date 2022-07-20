package practiceProject6;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	
	public static void main(String[] args) {
		
		//hashmap
		
		HashMap<Integer,String> map=new HashMap<Integer, String>();
		map.put(1, "Sweatha");
		map.put(2, "Rahul");
        map.put(3, "ALex");
		map.put(4, null); 
		map.put(null, "Sai"); 
		map.put(5, "Suresh");
		System.out.println("The elements of Hashmap are ");  
		System.out.println(map);
		System.out.println("Get element at key 3: "+map.get(3));
		System.out.println("Get element at key 5: "+map.get(5));
		
		//remove element by key
		
		map.remove(5);
		System.out.println(map);
		
		///iterate using for loop
		
		for (Map.Entry m:map.entrySet()) {
			
			System.out.println(m.getKey()+ " , "+m.getValue());
		}
		
		//hashtable
		
		Hashtable<Integer, String>  list= new Hashtable<Integer, String>();
		list.put(1, "Lily");
		list.put(2, "Tulip");
		list.put(3, "Rose");
		list.put(5, "Sunflower");
		System.out.println("\nThe elements of HashTable are "); 
		System.out.println(list);
	      for(Map.Entry n:list.entrySet()){    
	       System.out.println(n.getKey()+" , "+n.getValue());    
	      }
	      
	     //treemap
	     
	      TreeMap<Integer, String> hmm= new TreeMap<Integer, String>();
	      hmm.put(1, "Himalayas");
		  hmm.put(2, "Gangas");
		  hmm.put(3, "Nile");
		  hmm.put(4, null);
		  hmm.put(5, "Amazon");
		  System.out.println("\nThe elements of TreeMap are ");  	
		  System.out.println(hmm);
		  for(Map.Entry n:hmm.entrySet()){    
		       System.out.println(n.getKey()+" , "+n.getValue());    
		      }
      }
}
