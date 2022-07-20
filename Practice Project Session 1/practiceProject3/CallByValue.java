package practiceProject3;

public class CallByValue {
	int data=20;

	void change(int num) {
		this.data=num*10/100;
		//if parameter is not passed it will take default value, but once the parameter
		// is passed it will take the value of parameter
	}
	public static void main(String[] args) {
		
		CallByValue obj= new CallByValue();
		
		System.out.println("Before change: "+obj.data);
		
		obj.change(100);
		System.out.println("After change: "+obj.data);
	}

}
