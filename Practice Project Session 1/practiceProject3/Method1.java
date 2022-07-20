package practiceProject3;

public class Method1 {
	
	public void print() {
		System.out.println("Method without return type and without parameter");
	}
	
	public void display(String name) {
		System.out.println("My name is "+name);
	}
	
	public int area(int l,int b) {
		return l*b;
	}
	
	public String fullName(String fname, String lname) {
		return fname+" "+lname;
		
	}
	public static void main(String[] args) {
		Method1 obj= new Method1();
		obj.print();
		obj.display("Sweatha");
		
		int area=obj.area(10, 5);
		System.out.println("Area of triangle is: "+area);
		
		String MyName=obj.fullName("Sweatha", "S");
		System.out.println("My Name is: "+MyName);
		
	}

}
