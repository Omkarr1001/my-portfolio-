package demo1;

public class Main {
public static void main(String[] args) {
	
	Thread2 ob=new Thread2();
	Thread t1=new Thread(ob);
	System.out.println(t1.getState());
	t1.start();
}
}
//Explain thread lifecycle