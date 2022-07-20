package practiceProject2;

public class Accessmodifier {
	public void Public() {
		System.out.println("Hello! This is public method");
	}
	
	private void privaccess() {
		System.out.println("Welcome! This is private method");
	}
	
	void DefAccess() {
		System.out.println("Hi! This is default method");
	}
	
	protected void Proaccess() {
		System.out.println("This is protected method");
	}
	
	//same class able to aceess all types of modifiers
	public static void main(String [] args) {
		
		Accessmodifier obj= new  Accessmodifier();
		obj.Public();
		obj.privaccess();
		obj.DefAccess();
		obj.Proaccess();
		
		
	
	}

}
