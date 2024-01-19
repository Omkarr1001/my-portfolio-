package Demo1;
		
	public class Main {
	public static void main(String[] args) {
				
			
		Student s1=new Student ();
		s1.id=1;
		s1.name="omkar";
		s1.cgpa=8.82f;
		
		Student s2=new Student ();
		s2.id=2;
		s2.name="nilesh";
		s2.cgpa=6.82f;
		
		
		Student s3=new Student ();
		s3.id=3;
		s3.name="aniket";
		s3.cgpa=7.82f;
		
		Student s[]=new Student[3];
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		
		
	System.out.println(s1.id+"|"+s1.name+"= "+s1.cgpa);
	System.out.println(s2.id+"|"+s2.name+"= "+s2.cgpa);
	System.out.println(s3.id+"|"+s3.name+"= "+s3.cgpa);
		
		}
		}