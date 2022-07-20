package practiceProject5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;


public class CollectionDemo {
	
	public static void main(String[] args) {
		
		//arraylist
		System.out.println("ArrayList");
		ArrayList<String> fruit=new ArrayList<String>();
		fruit.add("Apple");
		fruit.add("Orange");
		fruit.add("Strawbeery");
		fruit.add("Jackfruit");
		fruit.add("null");
		System.out.println(fruit);
		System.out.println("Size :"+fruit.size());
		System.out.println("Elemnet at index 3 :"+fruit.get(3));
		
		//linkedlist
		System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> vegetable=new LinkedList<String>();
	      vegetable.add("Tomato");
	      vegetable.add("Onion");
	      vegetable.add("Brinjal");
	      vegetable.add("Carrot");
	      vegetable.add("null");
	      System.out.println("Size :"+vegetable.size());
	      System.out.println(vegetable);
	      vegetable.remove(2);
	      System.out.println(vegetable);
	      
	      
	    //vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> list = new Vector<Integer>();
	      list.addElement(45); 
	      list.addElement(70); 
	      System.out.println(list);
	      
	    //priorityqueue
	      System.out.println("\n");
	      System.out.println("PriorityQueue");
	      PriorityQueue<Integer> num = new PriorityQueue<Integer>();
	      num.add(45);
	      num.add(13);
	      System.out.println(num);
	      
	      //hashset
	      System.out.println("\n");
	      System.out.println("HashSet");
	      HashSet<Integer> set=new HashSet<Integer>();
	      set.add(19);
	      set.add(78);
	      System.out.println(set);
	      
	      //linkedhashset
	      System.out.println("\n");
	      System.out.println("LinkedHashSet");
	      LinkedHashSet<String> city=new LinkedHashSet<String>();
	      city.add("Chennai");
	      city.add("Coimbatore");
	      System.out.println(city);
	      Iterator<String> itr=city.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	      }
	      
	      //treeset
	      System.out.println("\n");
	      System.out.println("TreeSet");
	      TreeSet<String> flower=new TreeSet<String>();
	      flower.add("Tulip");
	      flower.add("Jasmine");
	      flower.add("Sunflower");
	      flower.add("Rose");
	      flower.add("Lily");
	      System.out.println(flower);
	      System.out.println("Size : "+flower.size());
	      System.out.println("Contains :"+flower.contains("Jasmine"));
	      
	      
	      }

}

