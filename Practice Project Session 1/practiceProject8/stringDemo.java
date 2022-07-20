package practiceProject8;

public class stringDemo {
	public static void main(String[] args) {
		//string methods
		System.out.println("Methods of Strings");
		String s1 = new String("Welcome to the World");
		
		char c= s1.charAt(2);
		System.out.println("Character at index 2: "+c);
		
		System.out.println("Length: "+s1.length());
		
		//substring
				String sub=new String("Hello");
				System.out.println(sub.substring(3));
				
		//String Comparison
				String s3="Hello";
				String s2="Heldo";
				System.out.println(s3.compareTo(s2));
				
		//IsEmpty
				String s4="";
				System.out.println(s4.isEmpty());
				
		//uppercase
				 System.out.println("UPPER CASE: "+s1.toUpperCase());
				 
		//lowercase
				 System.out.println("lowercase: "+s1.toLowerCase());
				 
		//check the word 
				 System.out.println("Check the String contains word : world or not? : "+s1.contains("World"));
		//replace
					String s5="Heldo";
					String replace=s2.replace('d', 'l');
					System.out.println(replace);
		//equals			
					String s6="Welcome to Java";
					String s7="WeLcOmE tO JaVa";
					System.out.println(s6.equals(s7));
					
					System.out.println("\n");
					System.out.println("Creating StringBuffer");
		//Creating StringBuffer and append method
					StringBuffer s=new StringBuffer("Welcome to Universe!");
					s.append("Enjoy your life");
					System.out.println(s);
		//insert method
					s.insert(3, 'w');
					System.out.println(s);
	    //replace method
					StringBuffer sb=new StringBuffer("Hello");
					sb.replace(0, 3, "hEl");
					System.out.println(sb);
					
		//StringBuilder
					System.out.println("\n");
					System.out.println("Creating StringBuilder");
					StringBuilder sb1=new StringBuilder("Welcome");
					sb1.append("Learning");
					System.out.println(sb1);

					System.out.println(sb1.delete(0, 1));

					System.out.println(sb1.insert(1, "Hello"));

					System.out.println(sb1.reverse());
					//conversion	
					System.out.println("\n");
					System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
					
					String str = "Nature"; 
			        
			        // conversion from String object to StringBuffer 
			        StringBuffer sbr = new StringBuffer(str); 
			        sbr.reverse(); 
			        System.out.println("String to StringBuffer");
			        System.out.println(sbr); 
			          
			        // conversion from String object to StringBuilder 
			        StringBuilder sbl = new StringBuilder(str); 
			        sbl.append("Scene"); 
			        System.out.println("String to StringBuilder");
			        System.out.println(sbl);           
}

}
