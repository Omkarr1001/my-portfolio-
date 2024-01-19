package Demo;



public class Main1 {
	public static void main(String[] args) {
		
		int a[][]= {{5,7,6},
					{9,77,66},
					{55,22,77}
		};
	
		SumOfij s=new SumOfij();
		
		System.out.println("sum is  "+s.getSum(a));
	}

}
