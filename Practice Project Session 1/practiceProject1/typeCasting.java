package practiceProject1;

public class typeCasting {

	public static void main(String[] args) {
		//implicit type casting
		
		System.out.println("Implicit Type Casting");
		
		byte i=17;
		System.out.println("Byte value:"+i);
		
		short j=i;
		System.out.println("Short value:"+j);
		
		int k=j;
		System.out.println("Int value:"+k);
		
		long l=k;
		System.out.println("Long value:"+l);
		
		float m=l;
		System.out.println("Float value:"+m);
		
		double n=m;
		System.out.println("Double value:"+n);
		
		System.out.println("\n");
		
		//explicit type casting
		
		System.out.println("Explicit Type Casting");
		
		double o=176.9;
		//converting double data type to long data type
		long p=(long)o;
		//converting long data type to int data type 
		int q=(int)p;
		
		System.out.println("Before conversion:"+o);
		System.out.println("After conversion into long data type:"+p);
		System.out.println("After conversion into int data type:"+q);

	}

}
