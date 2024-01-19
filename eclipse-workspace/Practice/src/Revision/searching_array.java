package Revision;

public class searching_array {
	public static void main(String[] args) {
		int a[]= {45,78,69,14,15};
		int s=15;
		boolean w=false;
		
		for(int i=0;i<a.length;i++) {
			if(s==a[i]) {
			 w=true;
				break;
			}
			
		}
		if(w) {
			System.out.println("value is  present in array");
		}else
		{
			System.out.println("value is not present in array");
		}
	}

}
