package practiceProject3;

public class MethodOverLoad {
	int add(int a, int b,int c) {
		return a+b+c;
	}
	int sub(int a, int b) {
		return a-b;
	}
	float mul(float a, float b) {
		return a*b;
	}
	
	float eqiTriangle(float a) {
		return a*a;
	}
	
	double div(double a, double b) {
		return a/b;
	}
	
	
	 
	
	public static void main(String[] args) {
		MethodOverLoad obj= new MethodOverLoad();
		System.out.println("Addition :"+obj.add(23, 4, 10));
		System.out.println("Subtraction : "+obj.sub(20, 15));
		System.out.println("Multiplication :"+obj.mul(19.45f,7.89f));
		System.out.println("Division :"+obj.div(100, 30));
		System.out.println("Area of Equilateral Triangle :"+(0.433*23.0*23.0));
		
		
	}

}
