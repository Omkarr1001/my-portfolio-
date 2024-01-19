package Demo1;

public class Main {
	public static void main(String[] args) {
		
		Practrice obj=(a,b)->a+b;
		System.out.println(obj.m1(10,20));
		
		 	obj=(a,b)->a-b;
		System.out.println(obj.m1(10,20));
		
			obj=(a,b)->a*b;
		System.out.println(obj.m1(10,20));
		
		
			obj=(a,b)->a/b;
		System.out.println(obj.m1(10,20));
		
		
			obj=(a,b)->a%b;
		System.out.println(obj.m1(10,20));
	}

}
