package Demo7;

public class DigonalSum {
	public static void main(String[] args) {
		
		int a[][]= {
				{4,5,9},//0
				{3,9,8},//1
				{9,5,6}//2
		
	};
		int sum=0;
		
		
		
		
		for(int i=0;i<a.length;i++)
		{for(int j=0;j<a.length;j++)
		{
			
			System.out.print( a[i][j]+" ");
		}
		System.out.println();
		
					
					
		sum+=a[i][a.length-1-i];
				
				}
			
			System.out.println(sum);
		
	
		
		}
	
	}

