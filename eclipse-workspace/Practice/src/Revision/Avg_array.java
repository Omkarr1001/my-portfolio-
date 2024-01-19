package Revision;

public class Avg_array {
	public static void main(String[] args) {
		
		int a[]= {45,65,74,58,62,25};
		int sum=0;
		for(int e: a) {
			sum=sum+e;
			System.out.println(e);
			
		}
		System.out.println("sum is "+sum);
		System.out.println(a.length);
		System.out.println("The avg of array is: "+sum/a.length);
		
	}

}
