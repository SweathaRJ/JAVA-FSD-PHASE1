package practiceproject7p1;

public class OuterMember {
	
	private int data=40;
		class Inner{
			void msg() {
				System.out.println("Data is " + data);
			}
		
	public void main(String[] args) {
		OuterMember obj=new OuterMember();
		OuterMember.Inner in=obj.new Inner();
		in.msg();
		

	       }

       }
	}
