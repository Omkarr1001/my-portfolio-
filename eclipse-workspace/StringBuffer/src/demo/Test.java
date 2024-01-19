package demo;

public class Test {
	public static void main(String[] args) {
		
		String s1="hello";
		System.out.println(s1.toUpperCase());
		System.out.println(s1);  //String are immutable object
		
		
		String s2="Omkar";
		String s3=s2+"Salunkhe";
		
		System.out.println(s2);
		System.out.println(s3);
		
		String s4="Omkar";
		String s5="salunkhe";
		 s4=s2+s1;  // string are immutable so they cannot change in s4 variable they creat a refrance of s2 and creat new string 
		
		 System.out.println(s4);
		 System.out.println(s5);
		 
		 StringBuffer sb=new StringBuffer("omkar");//stringbuffer are mutable //also stringbuffer object are threadsafe
		 sb.append("salunkhe");// it is used to  when u change in existing string 
		
	}

}
