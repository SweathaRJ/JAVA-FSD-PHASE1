package practiceproject7p1;

public class LocalInner {
	private int data=20;
	void display() {
		class local{
			void msg() {
				System.out.println("Data is : " + data);
			}
		}
		local l=new local();
		l.msg();
	}
	
	public static void main(String[] args) {
		LocalInner obj=new LocalInner();
		obj.display();
		
	}

}
