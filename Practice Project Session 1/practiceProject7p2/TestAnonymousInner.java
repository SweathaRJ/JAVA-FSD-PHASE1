package practiceProject7p2;

public class TestAnonymousInner {
	
	public static void main(String[] args) {
		person p=new person() {
			void eat() {
				System.out.println("nice fruits");
			}
		};
		p.eat();
	}

}
