package Demo;

public class Display_Array {
	public static void main(String[] args) {
		float []f= {55.5f,99.4f,32.55f};
		// TO display array
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
		//to display revrse order array
		for(int i=f.length-1;i>=0;i--)
		{
			System.out.println(f[i]);
		}
		
		System.out.println(f.length);
	}

}
