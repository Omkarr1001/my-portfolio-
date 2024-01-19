package Revision;

public class min_array {

	public static void main(String[] args) {
		
		int a[]= {15,63,25,45,45,78};
		int min=Integer.MAX_VALUE;
		
		for(int e:a) {
			if(e<min) {
				min=e;
			}
		}System.out.println("The min value is: "+min);
	}
}
