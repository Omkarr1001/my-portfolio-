package Revision;

public class sorted_array {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		boolean s=false;
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<a[i+1]) {
				s=true;
				break;
			}
		}
		if(s) {
			System.out.println("The Array is sorted.");
		}else
		{
			System.out.println("the Array is not sorted.");
		}
	}

}
