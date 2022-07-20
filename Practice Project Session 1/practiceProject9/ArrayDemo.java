package practiceProject9;

public class ArrayDemo {
	public static void main(String[] args) {
		//single dimensional array
		System.out.println("Single Dimentional Array");
		int array[]= {24,19,37,15,96,58};
		System.out.println("Length of an Array: "+array.length);
		for(int i=0;i<6;i++)
		{
			System.out.println("Elements of array a: "+array[i]+"\t");
		}
		//multiple dimensional array
		System.out.println("\nMulti Dimensional array");
		int arr[][]= {{9,2,6},{3,2,0},{4,2,8}};
		System.out.println("Access first row first element: "+arr[0][0]);
		System.out.println("Access first row 2nd element: "+arr[0][1]);
		System.out.println("Access first row 3rd element: "+arr[0][2]);
        for (int row=0; row<3; row++) {
			
			for(int col=0;col<3;col++) {
				
				System.out.print(arr[row][col]+"\t");
			}
			System.out.println();
}
}
}
