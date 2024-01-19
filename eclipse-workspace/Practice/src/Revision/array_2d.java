package Revision;

public class array_2d {
	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{11,22,33},{44,55,66}};
		int result[][]= {{0,0,0},{0,0,0}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				result[i][j]=a[i][j]+b[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
