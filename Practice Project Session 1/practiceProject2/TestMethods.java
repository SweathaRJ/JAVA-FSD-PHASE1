package practiceProject2;

public class TestMethods {
	public static void main(String [] args) {
		
		Accessmodifier obj= new  Accessmodifier();
				
				obj.DefAccess();
				//obj.methodPrivate(); private method we can't access out side of class, its scope is within the class
				obj.Proaccess();
				obj.Public();
			}

}
